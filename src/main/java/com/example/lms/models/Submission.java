package com.example.lms.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Setter
@Getter
public class Submission {
    @Id
    private Long id;                 // Unique ID for the submission
    private Long assignmentId;       // ID of the associated assignment
    private Long studentId;          // ID of the student submitting the assignment
    private String fileLink;         // Link to the submitted file
    private String grade;            // Grade assigned to the submission
    private String feedback;         // Feedback provided by the instructor

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}