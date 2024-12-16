package com.example.lms.Repositories;

import com.example.lms.entities.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;

import java.util.*;

@Setter
@Getter
@Repository
public class CourseRepo {
    private List<Course> courses;//act as the database

    public CourseRepo() {
    }

    public CourseRepo(List<Course> courses) {
        this.courses = courses;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public Course getCourseById(int id) {
        for (Course course : courses) {
            if (course.getCourseId() == id) {
                return course;
            }
        }
        return null;
    }

    public boolean deleteCourse(int courseId) {
        return courses.removeIf(course -> course.getCourseId() == courseId);
    }
}
