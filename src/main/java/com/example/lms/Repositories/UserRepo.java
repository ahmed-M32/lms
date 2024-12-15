package Repositories;

import entities.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepo {
    private final List<User> StudentList= new ArrayList<>();
    public void addUser(User user) {
        StudentList.add(user);
    }
    public void removeUser(User user) {
        StudentList.remove(user);
    }

    public Optional<User> findById(int id) {
        return StudentList.stream().filter(user -> user.getId() == id).findFirst();
    }
}
