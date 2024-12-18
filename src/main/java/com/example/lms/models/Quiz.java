package com.example.lms.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Entity
@Setter
@Getter
@Data
public class Quiz {
    @Id
    private Long id;                 // Unique ID for the quiz
    private String title;            // Title of the quiz
    private int totalQuestions;// Total number of questions in the quiz
    @OneToMany
    private List<Question> questions; // List of questions in the quiz

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
