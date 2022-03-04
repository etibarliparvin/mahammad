package com.example.mahammad.dto.response;

import lombok.Data;

@Data
public class BranchResponse {

    private Long id;
    private String name;
    private String manager;
    private Integer employeeCount;
}
