package com.example.mahammad.service.person;

import com.example.mahammad.dto.request.PersonRequest;
import com.example.mahammad.dto.response.PersonResponse;
import com.example.mahammad.mapper.PersonMapper;
import com.example.mahammad.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PersonService {

    void create(PersonRequest request);

    List<PersonResponse> findAll();
}
