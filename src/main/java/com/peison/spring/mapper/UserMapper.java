package com.peison.spring.mapper;

import com.peison.spring.dao.User;
import com.peison.spring.dao.UserWithRole;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component(value = "UserMapper")
public interface UserMapper {
     List<User> findAll();
     List<User> findByID(int id);

     @Select("SELECT * FROM user WHERE user = #{name} limit 1")
     User findOneByName(String name);

     @Insert(" insert into user (user,passwd,gender,age) values (#{user},#{passwd},#{gender},#{age})")
     int insertUser(User user);

     @Select("select * from user where id = #{userId}")
     @Results({
             @Result(property = "id", column = "id"),
             @Result(property="role",column="id",many=@Many(select="com.peison.spring.mapper.RoleMapper.getRoleByUserId"))
     })
     UserWithRole getUserWithRole(int userId);

     // 多表查询：https://blog.csdn.net/qq_25652949/article/details/80889204?utm_source=blogxgwz0
}
