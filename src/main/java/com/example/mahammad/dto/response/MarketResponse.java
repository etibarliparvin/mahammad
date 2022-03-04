package com.example.mahammad.dto.response;

import lombok.Data;

import java.util.List;

@Data
public class MarketResponse {

    private Long id;
    private String name;
    private AddressResponse address;
    private List<BranchResponse> branches;
}
