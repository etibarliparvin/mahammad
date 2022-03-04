package com.example.mahammad.controller;

import com.example.mahammad.dto.request.StudentRequest;
import com.example.mahammad.service.student.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService service;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody StudentRequest request) {
        return ResponseEntity.ok(service.create(request));
    }
}
