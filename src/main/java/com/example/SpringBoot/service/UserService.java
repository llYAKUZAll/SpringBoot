package com.example.SpringBoot.service;

import com.example.SpringBoot.model.User;


import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User getUserById(int id);

    void createUser(User user);

    void updateUser(User user);

    void deleteUserById(int id);
}