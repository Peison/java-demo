package com.peison.spring.mapper;

import com.peison.spring.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component(value = "UserMapper")
public interface UserMapper {
    public List<User> findAll();
}
