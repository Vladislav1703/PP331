package com.example.spring231.dao;

import com.example.spring231.models.User;

import java.util.List;

public interface UserDao {

    void addUser(User user);
    void updateUser(User user);
    User getUser(Long id);
    void deleteUser(Long id);
    List<User> getUsers();

}
