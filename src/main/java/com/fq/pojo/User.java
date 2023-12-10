package com.fq.pojo;

import java.util.List;
import java.util.Objects;

public class User {
    private String userName;
    private String password;
    private Cat cat;  // 自定义引用类型
    private List<Course> courses;

    public User() {
    }

    public User(String userName, String password, Cat cat, List<Course> courses) {
        this.userName = userName;
        this.password = password;
        this.cat = cat;
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", cat=" + cat +
                ", courses=" + courses +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
