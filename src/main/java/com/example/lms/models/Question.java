package com.example.lms.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Entity
@Setter
@Getter
public class Question {
    @Getter
    @Setter
    @Id
    private Long id;                 // Unique ID for the question
    private String questionText;     // Text of the question
    private String optionA;          // Option A
    private String optionB;          // Option B
    private String optionC;          // Option C
    private String optionD;          // Option D
    private String correctAnswer;    // Correct answer (e.g., "A", "B")

}