package com.example.lms.Repositories;

import com.example.lms.models.*;
import org.springframework.stereotype.Repository;

import java.util.*;


@Repository
public class CourseRepo {
    private final List<Course1> cours = new ArrayList<>();//act as the database


    public void addCourse(Course1 course1) {
        cours.add(course1);
    }

    public Optional<Course1> getCourseById(int id) {
        return cours.stream().filter(course1 -> course1.getCourseId() == id).findFirst();

    }

    public List<Course1> getAllCourses() {
        return new ArrayList<>(cours);
    }

    public boolean deleteCourse(int courseId) {
        return cours.removeIf(course1 -> course1.getCourseId() == courseId);
    }
}
