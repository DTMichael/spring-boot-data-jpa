package com.atguigu.springboot.controller;

import com.atguigu.springboot.entity.User;
import com.atguigu.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;
    @GetMapping("/user/{id}")
    @ResponseBody
    public Optional<User> getUser(@PathVariable("id") Integer id){
        Optional<User> byId = userRepository.findById(id);
        return byId;
    }
    @ResponseBody
    @GetMapping("/user/insert")
    public User insertUser(User user){
        return userRepository.save(user);
    }
}
