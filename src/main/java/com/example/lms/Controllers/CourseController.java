package com.example.lms.Controllers;

import com.example.lms.models.Course1;
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
    public ResponseEntity<Course1> createCourse(@RequestBody Course1 course1) {
        return ResponseEntity.ok(courseService.createCourse(course1));
    }

    @GetMapping
    public ResponseEntity<List<Course1>> getAllCourses() {
        List<Course1> cours = courseService.getAllCourses();
        return ResponseEntity.ok(cours);
    }

    @GetMapping("/{Id}")
    public ResponseEntity<Course1> getCourseById(@PathVariable int Id) {
        return courseService.getCourseById(Id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Course1> deleteCourseById(@PathVariable int id) {
        boolean removed = courseService.removeCourseById(id);
        if (removed) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
