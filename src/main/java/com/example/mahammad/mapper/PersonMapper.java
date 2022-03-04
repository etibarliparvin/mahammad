package com.example.mahammad.mapper;

import com.example.mahammad.dto.request.PersonRequest;
import com.example.mahammad.dto.response.PersonResponse;
import com.example.mahammad.entity.Person;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PersonMapper {

    Person map(PersonRequest request);

    PersonResponse map(Person person);
}
