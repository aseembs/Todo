package com.todo.todoservice.controllers;

import com.todo.todoservice.pojo.TodoRecords;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class DatabaseController {

    @GetMapping("/get")
    public TodoRecords get() {
        return TodoRecords.builder()
                .record("Something")
                .time(LocalDateTime.now())
                .isCompleted(false)
                .build();
    }
}
