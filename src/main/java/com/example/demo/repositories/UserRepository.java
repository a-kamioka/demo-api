package com.example.demo.repositories;

import org.springframework.data.repository.ListCrudRepository;

import com.example.demo.models.User;

public interface UserRepository extends ListCrudRepository<User, Integer> {

    User findByUsernameAndPassword(String username, String password);
}
