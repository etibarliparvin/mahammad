package com.example.mahammad.service.person;

import com.example.mahammad.dto.request.PersonRequest;
import com.example.mahammad.dto.request.PhoneRequest;
import com.example.mahammad.dto.response.PersonResponse;
import com.example.mahammad.entity.Person;
import com.example.mahammad.entity.Phone;
import com.example.mahammad.mapper.PersonMapper;
import com.example.mahammad.mapper.PhoneMapper;
import com.example.mahammad.repository.PersonRepository;
import com.example.mahammad.service.phone.PhoneService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;
    private final PersonMapper personMapper;
    private final PhoneService phoneService;

    @Override
    public void create(PersonRequest personRequest) {
        Person person = personMapper.map(personRequest);
        personRepository.save(person);

        phoneService.saveAll(personRequest.getPhoneList(), person);

    }

    @Override
    public List<PersonResponse> findAll() {
        return personMapper.mapToList(personRepository.findAll());
    }
}
