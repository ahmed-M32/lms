package com.example.lms.entities;

import lombok.Data;

@Data
public class Question {
    private Long id;                 // Unique ID for the question
    private String questionText;     // Text of the question
    private String optionA;          // Option A
    private String optionB;          // Option B
    private String optionC;          // Option C
    private String optionD;          // Option D
    private String correctAnswer;    // Correct answer (e.g., "A", "B")
}