package com.SEP4.IndoorGarden.service;

import com.SEP4.IndoorGarden.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User saveUser(User user);
    List<User> getAllUsers();
    Optional<User> getUserById(Long id);

    User updateUser(User user);
    void deleteUser(Long id);
}
