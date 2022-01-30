package com.example.spring231.services;

import com.example.spring231.models.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    void addUser(User user);
    void updateUser(User user);
    User getUser(Long id);
    void deleteUser(Long id);
    List<User> getUsers();
}
