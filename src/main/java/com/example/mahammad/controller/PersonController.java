package com.example.mahammad.controller;

import com.example.mahammad.dto.request.PersonRequest;
import com.example.mahammad.service.person.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class PersonController {

    private final PersonService personService;

    @PostMapping("/person")
    public ResponseEntity<?> create(@RequestBody PersonRequest request){
        personService.create(request);
        return ResponseEntity.ok(HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(personService.findAll());
    }
}
