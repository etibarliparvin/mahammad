package com.example.mahammad.mapper;

import com.example.mahammad.dto.request.AddressRequest;
import com.example.mahammad.dto.response.AddressResponse;
import com.example.mahammad.entity.Address;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AddressMapper {

//    @Mapping(target = "market", ignore = true)
    Address toEntity(AddressRequest request);

    AddressResponse toResponse(Address address);
}
