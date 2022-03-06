package com.example.mahammad.dto.request;

import com.example.mahammad.entity.Phone;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonRequest {

    private String name;
    private List<PhoneRequest> phoneList;
}
