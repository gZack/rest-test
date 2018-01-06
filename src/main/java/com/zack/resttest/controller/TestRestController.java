package com.zack.resttest.controller;

import com.zack.resttest.model.User;
import com.zack.resttest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@Controller
@RequestMapping("/api")
public class TestRestController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/users")
    public List<User> users(){
        return userService.findAllUsers();
    }

    @RequestMapping("/users/{name}")
    public  List<User> findUser(@PathVariable String name){
        return userService.findUser(name);
    }

    @RequestMapping(value = "/users/add", method = RequestMethod.POST)
    public User saveUser(@RequestBody User user){
        return userService.save(user);
    }

    @RequestMapping(value = "/users/{age}", method = RequestMethod.GET, produces = "application/json", consumes = "application/json")
    public List<User> findUserByAge(@PathVariable Integer age){
        return userService.findUserByAge(age);
    }
}
