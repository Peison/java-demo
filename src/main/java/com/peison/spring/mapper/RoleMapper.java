package com.peison.spring.mapper;

import com.peison.spring.dao.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Mapper
@Component("RoleMapper")
public interface RoleMapper {

    @Select("SELECT * FROM role WHERE userId = #{id} ")
    Role getRoleByUserId(int userId);
}
