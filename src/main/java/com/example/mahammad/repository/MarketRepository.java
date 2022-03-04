package com.example.mahammad.repository;

import com.example.mahammad.dto.request.MarketRequest;
import com.example.mahammad.dto.response.MarketResponse;
import com.example.mahammad.entity.Market;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarketRepository extends JpaRepository<Market, Long> {

}
