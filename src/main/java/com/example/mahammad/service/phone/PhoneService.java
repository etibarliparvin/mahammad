package com.example.mahammad.service.phone;

import com.example.mahammad.dto.request.PhoneRequest;
import com.example.mahammad.dto.response.PhoneResponse;
import com.example.mahammad.entity.Person;

import java.util.List;

public interface PhoneService {

    void saveAll(List<PhoneRequest> request, Person person);
    void save(PhoneRequest request, Person person);

    List<PhoneResponse> findAll();
}
