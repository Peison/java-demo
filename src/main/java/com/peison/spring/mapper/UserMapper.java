package com.peison.spring.mapper;

import com.peison.spring.dao.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component(value = "UserMapper")
public interface UserMapper {
     List<User> findAll();
     List<User> findByID(int id);

     @Select("SELECT * FROM user WHERE user = #{name} limit 1")
     User findOneByName(String name);
}
