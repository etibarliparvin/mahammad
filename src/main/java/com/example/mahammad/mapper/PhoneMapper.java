package com.example.mahammad.mapper;

import com.example.mahammad.dto.request.PhoneRequest;
import com.example.mahammad.dto.response.PhoneResponse;
import com.example.mahammad.entity.Phone;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PhoneMapper {

    Phone map(PhoneRequest request);

    PhoneResponse map(Phone phone);

    List<PhoneResponse> map(List<Phone> phones);
}
