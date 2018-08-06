package com.github.stanislavnikles.springangular.controller;

import com.github.stanislavnikles.springangular.domain.User;
import com.github.stanislavnikles.springangular.persistance.UserRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/all-users")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<User> getAll() {
        return this.userRepository.findAll();
    }
}
