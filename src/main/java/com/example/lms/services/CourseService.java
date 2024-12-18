package com.example.lms.services;

import com.example.lms.Repositories.CourseRepo;
import com.example.lms.models.Course1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CourseService {
    @Autowired
    private CourseRepo courseRepo;
    private static int idCounter = 1;

    public Course1 createCourse(Course1 course1) {
        course1.setCourseId(generateCourseId());
        courseRepo.addCourse(course1);
        return course1;
    }

    public List<Course1> getAllCourses() {
        return courseRepo.getAllCourses();
    }

    public Optional<Course1> getCourseById(int id) {
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
