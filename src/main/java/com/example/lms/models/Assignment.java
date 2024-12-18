package com.example.lms.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Data
public class Assignment {
    @Id
    private Long id;                 // Unique ID for the assignment
    private String title;            // Title of the assignment
    private String description;      // Description of the assignment
    private String dueDate;          // Due date of the assignment

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}