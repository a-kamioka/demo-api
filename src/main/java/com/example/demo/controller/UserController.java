package com.example.demo.controller;

import com.example.demo.models.User;
import com.example.demo.services.UserService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("api/users")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping()
    public @ResponseBody Iterable<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping()
    public @ResponseBody int addUser(@RequestBody User user) {
        return userService.registerUser(user);
    }

    @PostMapping(path="/login")
    public @ResponseBody int loginUser(@RequestBody User user) {
        return userService.loginUser(user);
    }
}
