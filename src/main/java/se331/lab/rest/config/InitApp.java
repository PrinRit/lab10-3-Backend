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

        Bid bid1,bid2,bid3,bid4,bid5,bid6,bid7,bid8,bid9,bid10,bid11,bid12,bid13,bid14,bid15;
        bid1 = bidRepository.save(Bid.builder().amount(5).datetime("2021-01-01").build());
        bid2 = bidRepository.save(Bid.builder().amount(10).datetime("2021-02-02").build());
        bid3 = bidRepository.save(Bid.builder().amount(15).datetime("2021-03-03").build());
        bid4 = bidRepository.save(Bid.builder().amount(20).datetime("2021-04-04").build());
        bid5 = bidRepository.save(Bid.builder().amount(25).datetime("2021-05-05").build());
        bid6 = bidRepository.save(Bid.builder().amount(30).datetime("2021-06-06").build());
        bid7 = bidRepository.save(Bid.builder().amount(35).datetime("2021-07-07").build());
        bid8 = bidRepository.save(Bid.builder().amount(40).datetime("2021-08-08").build());
        bid9 = bidRepository.save(Bid.builder().amount(45).datetime("2021-09-09").build());
        bid10 = bidRepository.save(Bid.builder().amount(50).datetime("2021-10-10").build());
        bid11 = bidRepository.save(Bid.builder().amount(55).datetime("2021-11-11").build());
        bid12 = bidRepository.save(Bid.builder().amount(60).datetime("2021-12-12").build());
        bid13 = bidRepository.save(Bid.builder().amount(65).datetime("2021-12-13").build());
        bid14 = bidRepository.save(Bid.builder().amount(70).datetime("2021-12-14").build());
        bid15 = bidRepository.save(Bid.builder().amount(75).datetime("2021-12-15").build());

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
        bid7.setItem(Auc3);
        Auc3.getBids().add(bid7);
        Auc3.setSuccessfulBid(bid7);

        bid8.setItem(Auc3);
        Auc3.getBids().add(bid8);
        Auc3.setSuccessfulBid(bid8);

        bid9.setItem(Auc3);
        Auc3.getBids().add(bid9);
        Auc3.setSuccessfulBid(bid9);

        Auc4 = auctionItemRepository.save(AuctionItem.builder()
                .description("A King of Mumbai")
                .type("Money")
                .build());
        bid10.setItem(Auc4);
        Auc4.getBids().add(bid10);
        Auc4.setSuccessfulBid(bid10);

        bid11.setItem(Auc4);
        Auc4.getBids().add(bid11);
        Auc4.setSuccessfulBid(bid11);

        bid12.setItem(Auc4);
        Auc4.getBids().add(bid12);
        Auc4.setSuccessfulBid(bid12);

        Auc5 = auctionItemRepository.save(AuctionItem.builder()
                .description("Operators")
                .type("Gold")
                .build());
        bid13.setItem(Auc5);
        Auc5.getBids().add(bid13);
        Auc5.setSuccessfulBid(bid13);

        bid14.setItem(Auc5);
        Auc5.getBids().add(bid14);
        Auc5.setSuccessfulBid(bid14);

        bid15.setItem(Auc5);
        Auc5.getBids().add(bid15);
        Auc5.setSuccessfulBid(bid15);

    }
}
