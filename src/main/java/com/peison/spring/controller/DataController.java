package com.peison.spring.controller;

import com.peison.spring.entity.User;
import com.peison.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DataController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getUser")
    public User getUser() {
        User user = new User();
        user.setUser("Tony");
        user.setPasswd("123456");
        user.setAge(12);
        user.setGender(1);
        return user;
    }

    @RequestMapping("/getAllUser")
    public List<User> getAllUser() {
        return userService.getAllUser();
    }
}
