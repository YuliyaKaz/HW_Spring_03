package com.example.spring_03_02.services;

import com.example.spring_03_02.domain.User;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    public void notifyUser(User user) {
        System.out.println("A new user has been created: " + user.getName());
    }
}
