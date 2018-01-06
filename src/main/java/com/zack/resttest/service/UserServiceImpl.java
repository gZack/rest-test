package com.zack.resttest.service;

import com.zack.resttest.model.User;
import com.zack.resttest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> findAllUsers() {
        return (List<User>) userRepository.findAll();
    }

    @Override
    public List<User> findUser(String name) {
        return userRepository.findUserByName(name);
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }



    @Override
    public List<User> findUserByAge(int age ){
        return userRepository.findUserByAge(age);
    }
}
