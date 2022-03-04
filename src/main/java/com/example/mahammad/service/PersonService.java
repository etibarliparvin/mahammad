package com.example.mahammad.service;

import com.example.mahammad.dto.request.PersonRequest;
import com.example.mahammad.dto.response.PersonResponse;
import com.example.mahammad.mapper.PersonMapper;
import com.example.mahammad.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonService {

     private final PersonRepository repository;
     private final PersonMapper personMapper;

     public PersonResponse create(PersonRequest request){
         return personMapper.map(repository.save(personMapper.map(request)));
     }
}
