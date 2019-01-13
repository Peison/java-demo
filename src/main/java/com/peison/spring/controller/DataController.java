package com.peison.spring.controller;

import com.peison.spring.dao.User;
import com.peison.spring.service.UserServiceInterface;
import com.peison.spring.service.UserServiceClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DataController {

    @Autowired
    private UserServiceInterface userService;

    @Autowired
    private UserServiceClass userServiceClass;

    @RequestMapping("/getAllUser")
    public List<User> getAllUser()
    {
        System.out.println(userServiceClass);
        return userServiceClass.getAllUser();
    }

    @RequestMapping("/getUser/{id}")
    public List<User> getUser(@PathVariable("id") int id) {
        return userService.getUserByID(id);
    }

    @RequestMapping("/getUserByName/{name}")
    public User getUserOne(@PathVariable("name") String name) {
        return userService.getOneByName(name);
    }

    @RequestMapping("/getUserByAge/{age}")
    public String getUserByAge(@PathVariable("age") double age) {
        return userServiceClass.getUserByAge(age);
    }
}
