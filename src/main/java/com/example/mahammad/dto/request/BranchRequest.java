package com.example.mahammad.dto.request;

import lombok.Data;

@Data
public class BranchRequest {

    private String name;
    private String manager;
    private Integer employeeCount;
}
