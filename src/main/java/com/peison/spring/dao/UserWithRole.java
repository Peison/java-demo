package com.peison.spring.dao;

import javax.persistence.Id;
import java.util.ArrayList;

public class UserWithRole {

    @Id
    private Integer id;
    private String user;
    private String passwd;
    private int gender;
    private double age;
    private ArrayList<Role> roles;


    public Integer getId() { return id; }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public ArrayList<Role> getRole() {
        return roles;
    }

    public void setRole(ArrayList<Role> roles) {
        this.roles = roles;
    }
}
