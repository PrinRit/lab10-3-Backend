package se331.lab.rest.util;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import se331.lab.rest.entity.AuctionItem;
import se331.lab.rest.entity.AuctionItemDTO;
import se331.lab.rest.entity.Bid;
import se331.lab.rest.entity.BidDTO;

import java.util.List;

@Mapper
public interface LabMapper {
    LabMapper INSTANCE = Mappers.getMapper(LabMapper.class);
    AuctionItemDTO getAuctionItemDto(AuctionItem event);
    List<AuctionItemDTO> getAuctionItemDto(List<AuctionItem> events);

    BidDTO getBidDTO(Bid organizer);
    List<BidDTO> getBidDTO(List<Bid> organizers);


}
