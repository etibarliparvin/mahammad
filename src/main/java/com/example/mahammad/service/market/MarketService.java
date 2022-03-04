package com.example.mahammad.service.market;

import com.example.mahammad.dto.request.MarketRequest;
import com.example.mahammad.dto.response.MarketResponse;

import java.util.List;

public interface MarketService {

    MarketResponse create(MarketRequest request);

    List<MarketResponse> findAll();
}
