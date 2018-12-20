package com.peison.spring.service;

import com.peison.spring.dao.User;
import com.peison.spring.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAllUser() {
        return userMapper.findAll();
    }

    @Override
    public List<User> getUserByID(int id) {
        return userMapper.findByID(id);
    }
}
