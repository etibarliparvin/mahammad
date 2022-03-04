package com.example.mahammad.service.market;

import com.example.mahammad.dto.request.MarketRequest;
import com.example.mahammad.dto.response.AddressResponse;
import com.example.mahammad.dto.response.MarketResponse;
import com.example.mahammad.entity.Address;
import com.example.mahammad.entity.Market;
import com.example.mahammad.mapper.AddressMapper;
import com.example.mahammad.mapper.MarketMapper;
import com.example.mahammad.repository.AddressRepository;
import com.example.mahammad.repository.MarketRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MarketServiceImpl implements MarketService {

    private final MarketRepository marketRepository;
    private final AddressRepository addressRepository;
    private final MarketMapper marketMapper;
    private final AddressMapper addressMapper;

    @Override
    public MarketResponse create(MarketRequest request) {
        Market market = marketMapper.toEntity(request);
        Market savedMarket = marketRepository.save(market);

        Address address = addressMapper.toEntity(request.getAddress());
        address.setMarket(savedMarket);
        Address savedAddress = addressRepository.save(address);

        AddressResponse addressResponse = addressMapper.toResponse(savedAddress);
        MarketResponse marketResponse = marketMapper.toResponse(savedMarket);
        marketResponse.setAddress(addressResponse);
        return marketResponse;

//        return marketMapper.toResponse(savedMarket);
//        return marketMapper.toResponse(marketRepository.save(marketMapper.toEntity(request)));
    }

    @Override
    public List<MarketResponse> findAll() {
        return null;
    }
}
