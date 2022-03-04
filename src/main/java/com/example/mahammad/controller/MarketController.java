package com.example.mahammad.controller;

import com.example.mahammad.dto.request.MarketRequest;
import com.example.mahammad.service.market.MarketService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/market")
@RequiredArgsConstructor
public class MarketController {

    private final MarketService service;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody MarketRequest request) {
        return ResponseEntity.ok(service.create(request));
    }

    @GetMapping
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(service.findAll());
    }
}
