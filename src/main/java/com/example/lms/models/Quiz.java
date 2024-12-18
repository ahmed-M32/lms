package com.example.lms.entities;

import lombok.Data;
import java.util.List;

@Data
public class Quiz {
    private Long id;                 // Unique ID for the quiz
    private String title;            // Title of the quiz
    private int totalQuestions;      // Total number of questions in the quiz
    private List<Question> questions; // List of questions in the quiz
}
