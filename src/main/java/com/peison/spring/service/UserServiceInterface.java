package com.peison.spring.service;

import com.peison.spring.dao.User;

import java.util.List;

public interface UserServiceInterface {
    public List<User> getAllUser();
    public List<User> getUserByID(int id);
    public User getOneByName(String name);


}
