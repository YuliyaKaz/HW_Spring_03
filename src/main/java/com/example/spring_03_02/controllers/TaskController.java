package com.example.spring_03_02.controllers;

import com.example.spring_03_02.domain.User;
import com.example.spring_03_02.services.DataProcessingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    @Autowired
    private DataProcessingService service;

    @GetMapping
    public List<String> getAllTasks() {
        List<String> tasks = new ArrayList<>();
        tasks.add("sort");
        tasks.add("add");
        tasks.add("filter");
        return tasks;
    }

    @GetMapping("/sort")
    public List<User> getSortUserByAge() {
        return service.sortUsersByAge(service.getRepository().getUsers());
    }
    @GetMapping("/filter/{age}")
    public List<User> getFilterUserByAge(@PathVariable("age") int age) {
        return service.filterUsersByAge(service.getRepository().getUsers(), age);
    }

    @GetMapping("/calc")
    public Double getCalcAverageAge() {
        return service.calculateAverageAge(service.getRepository().getUsers());
    }
}
