package com.peison.spring.service;

import com.peison.spring.dao.User;
import com.peison.spring.mapper.UserMapper;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceClass  {

    @Autowired
    private UserMapper userMapper;

    public List<User> getAllUser() {
        return userMapper.findAll();
    }

    public List<User> getUserByID(int id) {
        return userMapper.findByID(id);
    }

    public String getUserByAge(double age) {
        return new SQL(){
            {
                SELECT("name");
                FROM("User");
                WHERE("age <="+age);
            }
        }.toString();
    }
}
