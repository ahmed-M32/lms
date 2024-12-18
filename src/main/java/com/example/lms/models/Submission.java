package com.example.lms.entities;

import lombok.Data;

@Data
public class Submission {
    private Long id;                 // Unique ID for the submission
    private Long assignmentId;       // ID of the associated assignment
    private Long studentId;          // ID of the student submitting the assignment
    private String fileLink;         // Link to the submitted file
    private String grade;            // Grade assigned to the submission
    private String feedback;         // Feedback provided by the instructor
}