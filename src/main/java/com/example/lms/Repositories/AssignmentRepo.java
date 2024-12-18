package com.example.lms.Repositories;

import com.example.lms.entities.Assignment;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class AssignmentRepo {

    private final List<Assignment> assignments = new ArrayList<>();

    public Assignment save(Assignment assignment) {
        assignments.add(assignment);
        return assignment;
    }

    public Optional<Assignment> findById(Long id) {
        return assignments.stream().filter(a -> a.getId().equals(id)).findFirst();
    }

    public List<Assignment> findAll() {
        return assignments;
    }
}

