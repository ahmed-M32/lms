package com.example.lms.services;

import com.example.lms.Repositories.UserRepo;
import com.example.lms.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    private int userIdCounter = 1;

    public User CreateUser(User user) {
        user.setId(generateId());
        userRepo.addUser(user);
        return user;
    }

    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    public Optional<User> getUserById(int id) {
        return userRepo.findById(id);
    }

    public boolean removeUserById(int id) {
        Optional<User> userOptional = userRepo.findById(id);
        if (userOptional.isPresent()) {
            userRepo.removeUser(id);
            return true;
        }
        return false;
    }

    private Long generateId() {
        return (long) userIdCounter++;
    }
}