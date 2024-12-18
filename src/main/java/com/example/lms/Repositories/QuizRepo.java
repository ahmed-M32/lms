package com.example.lms.Repositories;

import com.example.lms.entities.Quiz;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class QuizRepo {

    private final List<Quiz> quizzes = new ArrayList<>();

    public Quiz save(Quiz quiz) {
        quizzes.add(quiz);
        return quiz;
    }

    public Optional<Quiz> findById(Long id) {
        return quizzes.stream().filter(q -> q.getId().equals(id)).findFirst();
    }

    public List<Quiz> findAll() {
        return quizzes;
    }
}