package com.SEP4.IndoorGarden.controller;

import com.SEP4.IndoorGarden.entity.User;
import com.SEP4.IndoorGarden.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping
    private User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }
    @GetMapping
    private List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    private Optional<User> getUserById(@PathVariable("id") Long id){
        return userService.getUserById(id);
    }
    @PutMapping
    private User updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }
    @DeleteMapping("/{id}")
    private void deleteUser(@PathVariable("id") Long id){
        userService.deleteUser(id);
    }
}
