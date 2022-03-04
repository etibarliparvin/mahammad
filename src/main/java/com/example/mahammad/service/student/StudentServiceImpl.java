package com.example.mahammad.service.student;

import com.example.mahammad.dto.request.StudentRequest;
import com.example.mahammad.dto.response.StudentResponse;
import com.example.mahammad.mapper.StudentMapper;
import com.example.mahammad.repository.StudentRepository;
import com.example.mahammad.service.student.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository repository;
    private final StudentMapper mapper;

    @Override
    public StudentResponse create(StudentRequest request) {
        return mapper.toResponse(repository.save(mapper.toEntity(request)));
    }
}
