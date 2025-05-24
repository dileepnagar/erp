package com.dileep.erp.controller;

import com.dileep.erp.exception.UserNotFoundException;
import com.dileep.erp.model.User;
import com.dileep.erp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/user")
    private User newUser(@RequestBody User user){
        return userRepository.save(user);
    }

    @GetMapping("/users")
    private List<User> getAllUsers(){
        return userRepository.findAll();
    }

    @GetMapping("/user/{id}")
    private User getUserById(@PathVariable Long id){
        return userRepository.findById(id)
                .orElseThrow(()-> new UserNotFoundException(id));
    }
}
