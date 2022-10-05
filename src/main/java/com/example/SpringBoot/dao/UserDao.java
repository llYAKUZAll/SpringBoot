package com.example.SpringBoot.dao;

import com.example.SpringBoot.model.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUsers();

    User getUserById(int id);

    void createUser(User user);

    void updateUser(User user);

    void deleteUserById(int id);
}