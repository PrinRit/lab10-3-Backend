package se331.lab.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import se331.lab.rest.dao.AuctionItemDao;
import se331.lab.rest.dao.BidDao;
import se331.lab.rest.entity.AuctionItem;
import se331.lab.rest.entity.Bid;

import javax.transaction.Transactional;

@Service
public class AuctionItemServiceImpl implements AuctionItemService{
    @Autowired
    AuctionItemDao auctionItemDao;
    @Autowired
    BidDao bidDao;

    @Override
    public Integer getAuctionItemSize() {
        return auctionItemDao.getAuctionItemSize();
    }

    @Override
    public Page<AuctionItem> getAuctionItems(Integer pageSize, Integer page) {
        return auctionItemDao.getAuctionItems(pageSize, page);
    }

    @Override
    public AuctionItem getAuctionItem(Long id) {
        return auctionItemDao.getAuctionItem(id);
    }

    @Override
    @Transactional
    public AuctionItem save(AuctionItem auctionItem) {
        return auctionItemDao.save(auctionItem);
    }

    @Override
    public Page<AuctionItem> getAuctionItems(String description, Pageable pageable) {
        return auctionItemDao.getAuctionItem(description,pageable);
    }
}
