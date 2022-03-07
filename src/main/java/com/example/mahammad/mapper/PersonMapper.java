package com.example.mahammad.mapper;

import com.example.mahammad.dto.request.PersonRequest;
import com.example.mahammad.dto.response.PersonResponse;
import com.example.mahammad.entity.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PersonMapper {

    @Mapping(target = "phoneList", ignore = true)
    Person map(PersonRequest request);

    PersonResponse map(Person person);

    List<PersonResponse> mapToList(List<Person> person);
}
