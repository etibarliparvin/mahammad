package com.example.mahammad.service.student;

import com.example.mahammad.dto.request.StudentRequest;
import com.example.mahammad.dto.response.StudentResponse;

public interface StudentService {

    StudentResponse create(StudentRequest request);
}
