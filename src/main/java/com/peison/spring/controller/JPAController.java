package com.peison.spring.controller;

import com.peison.spring.dao.User;
import com.peison.spring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/jpa")
public class JPAController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/getAllUser")
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @RequestMapping("/getUser/{id}")
    public Optional<User> getUser(@PathVariable("id") Integer id) {
        return userRepository.findById(id);
    }

    @RequestMapping("/getUserByGender/{gender}")
    public List<User> getUserByGender(@PathVariable("gender") int gender) {
        return userRepository.findUserByGender(gender);
    }
}
