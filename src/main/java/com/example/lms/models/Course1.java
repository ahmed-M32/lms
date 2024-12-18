package com.example.lms.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Course1 {


    private String title;
    private String description;
    private String duration;
    @Id
    private int courseId;


    public Course1() {

    }

    public Course1(String title, String description, String duration) {
        this.title = title;
        this.description = description;
        this.duration = duration;
    }

    public Course1(int courseId, String title, String description, String duration) {
        this.courseId = courseId;
        this.title = title;
        this.description = description;
        this.duration = duration;
    }


}
