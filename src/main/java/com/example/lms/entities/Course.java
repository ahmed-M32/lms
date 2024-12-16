package com.example.lms.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Course {


    private String title;
    private String description;
    private int duration;
    @Id
    private int courseId;


    public Course() {

    }

    public Course(String title, String description, int duration) {
        this.title = title;
        this.description = description;
        this.duration = duration;
    }

    public Course(int courseId, String title, String description, int duration) {
        this.courseId = courseId;
        this.title = title;
        this.description = description;
        this.duration = duration;
    }


}
