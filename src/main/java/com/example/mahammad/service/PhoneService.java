package com.example.mahammad.service;

import com.example.mahammad.dto.request.PhoneRequest;
import com.example.mahammad.dto.response.PhoneResponse;
import com.example.mahammad.mapper.PhoneMapper;
import com.example.mahammad.repository.PhoneRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PhoneService {

    private final PhoneRepository repository;
    private final PhoneMapper phoneMapper;

    public PhoneResponse create(PhoneRequest request){
        return phoneMapper.map(repository.save(phoneMapper.map(request)));
    }
}
