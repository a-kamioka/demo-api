package com.example.demo.services;

import com.example.demo.models.User;
import com.example.demo.repositories.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

    public int registerUser(User user) {
        User newUser = new User(user.getId(), user.getUsername(), user.getPassword());
        userRepository.save(newUser);
        return user.getId();
    }

    public int loginUser(User user) {
        User loginUser = userRepository.findByUsernameAndPassword(user.getUsername(), user.getPassword());
        if (loginUser != null) {
            return loginUser.getId();
        } else {
            return 0;
        }
    }
}