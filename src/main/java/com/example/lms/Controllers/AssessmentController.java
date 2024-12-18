package com.example.lms.Controllers;

import com.example.lms.entities.*;
import com.example.lms.services.AssessmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/assessments")
public class AssessmentController {

    @Autowired
    private AssessmentService service;

    @PostMapping("/quizzes")
    public ResponseEntity<Quiz> createQuiz(@RequestBody Quiz quiz) {
        return ResponseEntity.ok(service.createQuiz(quiz));
    }

    @GetMapping("/quizzes/{id}")
    public ResponseEntity<Quiz> getQuiz(@PathVariable Long id) {
        Quiz quiz = service.getQuizById(id);
        if (quiz == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(quiz);
    }

    @PostMapping("/assignments/submit")
    public ResponseEntity<Submission> submitAssignment(@RequestBody Submission submission) {
        return ResponseEntity.ok(service.submitAssignment(submission));
    }

    @PostMapping("/assignments/{id}/grade")
    public ResponseEntity<Submission> gradeSubmission(
            @PathVariable Long id,
            @RequestParam String grade,
            @RequestParam String feedback) {
        Submission updated = service.gradeSubmission(id, grade, feedback);
        if (updated == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(updated);
    }

    @GetMapping("/assignments/{id}/submissions")
    public ResponseEntity<List<Submission>> getSubmissions(@PathVariable Long id) {
        return ResponseEntity.ok(service.getSubmissionsForAssignment(id));
    }
}