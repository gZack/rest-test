package com.zack.resttest.service;

import com.zack.resttest.model.User;

import java.util.List;

public interface UserService {
    List<User> findAllUsers();
    List<User> findUser(String name);
    User save(User user);
    List<User> findUserByAge(int age);
}
