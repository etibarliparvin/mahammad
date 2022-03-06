package com.example.mahammad.dto.response;

import com.example.mahammad.dto.request.PhoneRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonResponse {

    private String name;
    private List<PhoneRequest> phoneList;
}
