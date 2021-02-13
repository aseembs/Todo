package com.todo.todoservice.controllers;

import com.todo.todoservice.pojo.Abc;
import com.todo.todoservice.repository.AbcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DatabaseController {

    @Autowired
    AbcRepository abcRepository;

    @GetMapping("/get")
    public List<Abc> get() {
        return abcRepository.findAll();
    }
}
