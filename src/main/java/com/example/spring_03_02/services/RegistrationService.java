package com.example.spring_03_02.services;

import com.example.spring_03_02.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {
    private UserService userService;

    private DataProcessingService dataProcessingSerivce;

    private  NotificationService notificationService;

    public RegistrationService(DataProcessingService dataProcessingService,
                               UserService userService,
                               NotificationService notificationService) {
        this.dataProcessingSerivce = dataProcessingService;
        this.userService = userService;
        this.notificationService = notificationService;
    }
    public DataProcessingService getDataProcessingSerivce() {
        return dataProcessingSerivce;
    }
    public void processRegistration(String name, int age, String email){
        User user = userService.createUser(name, age, email);
        dataProcessingSerivce.addUserToList(user);
        notificationService.notifyUser(user);
    }
}
