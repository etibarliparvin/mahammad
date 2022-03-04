package com.example.mahammad.mapper;

import com.example.mahammad.dto.request.StudentRequest;
import com.example.mahammad.dto.response.StudentResponse;
import com.example.mahammad.entity.Student;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StudentMapper {

    Student toEntity(StudentRequest request);

    //    @Mapping(target = "surname", ignore = true)
    StudentResponse toResponse(Student student);
}
