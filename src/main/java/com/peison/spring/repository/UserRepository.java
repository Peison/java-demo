package com.peison.spring.repository;

import com.peison.spring.dao.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findUserByGender(int gender);

    List<User> findUserByAgeIsGreaterThan(double age);

    @Query(value = "SELECT * FROM user WHERE user = ?1", nativeQuery = true)
    User findByName(String name);
}
