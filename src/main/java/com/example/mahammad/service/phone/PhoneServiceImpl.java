package com.example.mahammad.service.phone;

import com.example.mahammad.dto.request.PhoneRequest;
import com.example.mahammad.dto.response.PhoneResponse;
import com.example.mahammad.entity.Person;
import com.example.mahammad.entity.Phone;
import com.example.mahammad.mapper.PhoneMapper;
import com.example.mahammad.repository.PhoneRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PhoneServiceImpl implements PhoneService {

    private final PhoneRepository phoneRepository;
    private final PhoneMapper phoneMapper;

    @Override
    public void saveAll(List<PhoneRequest> request, Person person) {
        for (PhoneRequest phoneRequest : request) {
            this.save(phoneRequest, person);
        }
    }

    @Override
    public void save(PhoneRequest phoneRequest, Person person) {
        Phone phone = phoneMapper.map(phoneRequest);
        phone.setPerson(person);

        phoneRepository.save(phone);
    }

    @Override
    public List<PhoneResponse> findAll() {
        return phoneMapper.map(phoneRepository.findAll());
    }
}
