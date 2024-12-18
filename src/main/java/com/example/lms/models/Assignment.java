package com.example.lms.entities;

import lombok.Data;

@Data
public class Assignment {
    private Long id;                 // Unique ID for the assignment
    private String title;            // Title of the assignment
    private String description;      // Description of the assignment
    private String dueDate;          // Due date of the assignment
}