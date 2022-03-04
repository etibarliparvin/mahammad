package com.example.mahammad.mapper;

import com.example.mahammad.dto.request.MarketRequest;
import com.example.mahammad.dto.response.MarketResponse;
import com.example.mahammad.entity.Market;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MarketMapper {

    Market toEntity(MarketRequest request);

    MarketResponse toResponse(Market market);
}
