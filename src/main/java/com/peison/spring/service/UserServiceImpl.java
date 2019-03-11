package com.peison.spring.service;

import com.peison.spring.dao.User;
import com.peison.spring.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary // 一个借口多个实现类时autowaired 会失败，需要加上primary注解指定装载哪个类
public class UserServiceImpl implements UserServiceInterface {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int insertUser(User user){ return userMapper.insertUser(user);}

    @Override
    public List<User> getAllUser() {
        return userMapper.findAll();
    }

    @Override
    public List<User> getUserByID(int id) {
        return userMapper.findByID(id);
    }

    @Override
    public User getOneByName(String name){return userMapper.findOneByName(name);}
}
