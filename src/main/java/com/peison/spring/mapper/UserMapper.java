package com.peison.spring.mapper;

import com.peison.spring.dao.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component(value = "UserMapper")
public interface UserMapper {
    public List<User> findAll();
    public List<User> findByID(int id);

    @Select("SELECT * FROM user WHERE user = #{name} limit 1")
    public User findOneByName(String name);
}
