package com.example.spring_03_02.repository;

import com.example.spring_03_02.domain.User;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserRepository {
    private List<User> users = new ArrayList<>();

    public List<User> getUsers(){
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public void addUser(User user) {
        users.add(user);
    }
}
