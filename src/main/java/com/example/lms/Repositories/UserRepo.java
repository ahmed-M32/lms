package com.example.lms.Repositories;

import com.example.lms.models.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Repository
public class UserRepo {
    private final List<User> UsersList= new ArrayList<>();
    public void addUser(User user) {
        UsersList.add(user);
    }
    public void removeUser(int id) {
        UsersList.removeIf(user -> user.getId() == id);
    }


    public Optional<User> findById(int id) {
        return UsersList.stream().filter(user -> user.getId() == id).findFirst();
    }
    public List<User> findAll() {
        return new ArrayList<>(UsersList);
    }
}
