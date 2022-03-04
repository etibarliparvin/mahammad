package com.example.mahammad.dto.request;

import lombok.Data;

import java.util.List;

@Data
public class MarketRequest {

    private String name;
    private AddressRequest address;
    private List<BranchRequest> branches;
}
