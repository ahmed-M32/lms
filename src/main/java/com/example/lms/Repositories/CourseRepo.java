package com.example.lms.Repositories;

import com.example.lms.entities.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;

import java.util.*;


@Repository
public class CourseRepo {
    private final List<Course> courses = new ArrayList<>();//act as the database


    public void addCourse(Course course) {
        courses.add(course);
    }

    public Optional<Course> getCourseById(int id) {
        return courses.stream().filter(course -> course.getCourseId() == id).findFirst();

    }

    public List<Course> getAllCourses() {
        return new ArrayList<>(courses);
    }

    public boolean deleteCourse(int courseId) {
        return courses.removeIf(course -> course.getCourseId() == courseId);
    }
}
