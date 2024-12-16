package com.example.lms.Controllers;

import com.example.lms.entities.Course;
import com.example.lms.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses/")
public class CourseController {
    @Autowired
    CourseService courseService;

    @PostMapping
    public ResponseEntity<Course> createCourse(@RequestBody Course course) {
        return ResponseEntity.ok(courseService.createCourse(course));
    }

    @GetMapping
    public ResponseEntity<List<Course>> getAllCourses() {
        List<Course> courses = courseService.getAllCourses();
        return ResponseEntity.ok(courses);
    }

    @GetMapping
    public ResponseEntity<Course> getCourseById(@RequestParam int id) {
        Course course = courseService.getCourseById(id);
        return ResponseEntity.ok(course);
    }

    @DeleteMapping
    public ResponseEntity<Course> deleteCourseById(@RequestParam int id) {
        boolean removed = courseService.removeCourseById(id);
        if (removed) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
