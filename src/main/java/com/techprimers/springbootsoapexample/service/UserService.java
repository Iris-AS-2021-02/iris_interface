package com.techprimers.springbootsoapexample.service;

import com.techprimers.spring_boot_soap_example.User;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {

    private static final Map<String, User> users = new HashMap<>();

    @PostConstruct
    public void initialize() {
        
       
    }


    public User getUsers(String name) {
        return users.get(name);
    }
}
