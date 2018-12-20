package com.peison.spring.controller;

import com.peison.spring.dao.User;
import com.peison.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DataController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getAllUser")
    public List<User> getAllUser() {
        return userService.getAllUser();
    }

    @RequestMapping("/getUser/{id}")
    public List<User> getAllUser(@PathVariable("id") int id) {
        return userService.getUserByID(id);
    }
}
