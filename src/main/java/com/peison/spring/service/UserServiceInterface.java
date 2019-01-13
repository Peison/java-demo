package com.peison.spring.service;

import com.peison.spring.dao.User;

import java.util.List;

public interface UserServiceInterface {
    List<User> getAllUser();

    List<User> getUserByID(int id);

    User getOneByName(String name);
}
