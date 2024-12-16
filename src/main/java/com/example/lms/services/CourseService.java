package com.example.lms.services;

import com.example.lms.Repositories.CourseRepo;
import com.example.lms.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CourseService {
    @Autowired
    private CourseRepo courseRepo;
    private static int idCounter = 1;

    public Course createCourse(Course course) {
        course.setCourseId(generateCourseId());
        courseRepo.addCourse(course);
        return course;
    }

    public List<Course> getAllCourses() {
        return courseRepo.getAllCourses();
    }

    public Optional<Course> getCourseById(int id) {
        return courseRepo.getCourseById(id);
    }

    public boolean removeCourseById(int id) {
        return courseRepo.deleteCourse(id);
    }

    public int generateCourseId() {
        int id = idCounter;
        idCounter++;
        return id;
    }
}
