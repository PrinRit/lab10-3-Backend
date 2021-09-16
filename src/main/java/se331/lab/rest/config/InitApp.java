package se331.lab.rest.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import se331.lab.rest.entity.AuctionItem;
import se331.lab.rest.entity.Bid;
import se331.lab.rest.repository.AuctionItemRepository;
import se331.lab.rest.repository.BidRepository;

import javax.transaction.Transactional;

@Component
public class InitApp implements ApplicationListener<ApplicationReadyEvent> {
    @Autowired
    AuctionItemRepository auctionItemRepository;
    @Autowired
    BidRepository bidRepository;

    @Override
    @Transactional
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {

        Bid bid1,bid2,bid3,bid4,bid5,bid6;
        bid1 = bidRepository.save(Bid.builder().amount(5).datetime("2021-01-01").build());
        bid2 = bidRepository.save(Bid.builder().amount(10).datetime("2021-02-02").build());
        bid3 = bidRepository.save(Bid.builder().amount(15).datetime("2021-03-03").build());
        bid4 = bidRepository.save(Bid.builder().amount(20).datetime("2021-04-04").build());
        bid5 = bidRepository.save(Bid.builder().amount(25).datetime("2021-05-05").build());
        bid6 = bidRepository.save(Bid.builder().amount(30).datetime("2021-06-06").build());

        AuctionItem Auc1,Auc2,Auc3,Auc4,Auc5;

        Auc1 = auctionItemRepository.save(AuctionItem.builder()
                .description("The Dominictoratto")
                .type("Money")
                .build());
        bid1.setItem(Auc1);
        Auc1.getBids().add(bid1);
        Auc1.setSuccessfulBid(bid1);

        bid2.setItem(Auc1);
        Auc1.getBids().add(bid2);
        Auc1.setSuccessfulBid(bid2);

        bid3.setItem(Auc1);
        Auc1.getBids().add(bid3);
        Auc1.setSuccessfulBid(bid3);

        Auc2 = auctionItemRepository.save(AuctionItem.builder()
                .description("The gold king Anudabe")
                .type("Gold")
                .build());
        bid4.setItem(Auc2);
        Auc2.getBids().add(bid4);
        Auc2.setSuccessfulBid(bid4);

        bid5.setItem(Auc2);
        Auc2.getBids().add(bid5);
        Auc2.setSuccessfulBid(bid5);

        bid6.setItem(Auc2);
        Auc2.getBids().add(bid6);
        Auc2.setSuccessfulBid(bid6);

        Auc3 = auctionItemRepository.save(AuctionItem.builder()
                .description("A bigest electricity shop")
                .type("Silver")
                .build());
        bid2.setItem(Auc3);
        Auc3.getBids().add(bid2);
        Auc3.setSuccessfulBid(bid2);

        bid3.setItem(Auc3);
        Auc3.getBids().add(bid3);
        Auc3.setSuccessfulBid(bid3);

        bid4.setItem(Auc3);
        Auc3.getBids().add(bid4);
        Auc3.setSuccessfulBid(bid4);

        Auc4 = auctionItemRepository.save(AuctionItem.builder()
                .description("A King of Mumbai")
                .type("Money")
                .build());
        bid1.setItem(Auc4);
        Auc4.getBids().add(bid1);
        Auc4.setSuccessfulBid(bid1);

        bid5.setItem(Auc4);
        Auc4.getBids().add(bid5);
        Auc4.setSuccessfulBid(bid5);

        bid6.setItem(Auc4);
        Auc4.getBids().add(bid6);
        Auc4.setSuccessfulBid(bid6);

        Auc5 = auctionItemRepository.save(AuctionItem.builder()
                .description("Operators")
                .type("Gold")
                .build());
        bid3.setItem(Auc5);
        Auc5.getBids().add(bid3);
        Auc5.setSuccessfulBid(bid3);

        bid5.setItem(Auc5);
        Auc5.getBids().add(bid5);
        Auc5.setSuccessfulBid(bid5);

        bid6.setItem(Auc5);
        Auc5.getBids().add(bid6);
        Auc5.setSuccessfulBid(bid6);

    }
}
