package com.github.stanislavnikles.springangular.controller;

import com.github.stanislavnikles.springangular.domain.User;
import com.github.stanislavnikles.springangular.persistance.UserRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/api")
public class UserController {

    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping("/all-users")
    public Collection<User> getAll() {
        return userRepository.findAll();
    }
}
