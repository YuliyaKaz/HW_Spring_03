package com.example.spring_03_02.controllers;

import com.example.spring_03_02.domain.User;
import com.example.spring_03_02.services.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    RegistrationService service;

    @GetMapping
    public List<User> getListUser() {
        return service.getDataProcessingSerivce().getRepository().getUsers();
    }

    @PostMapping("/body")
    public String addUserFromBody(@RequestBody User user) {
        service.getDataProcessingSerivce().getRepository().getUsers().add(user);
        return "User is already added from body";
    }
}
