package com.peison.spring.repository;

import com.peison.spring.dao.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findUserByGender(int gender);
}
