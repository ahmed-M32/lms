package com.example.lms.services;

import com.example.lms.entities.*;
import com.example.lms.Repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssessmentService {

    @Autowired
    private QuizRepo quizRepository;

    @Autowired
    private AssignmentRepo assignmentRepository;

    @Autowired
    private SubmissionRepo submissionRepository;

    // Quiz Methods
    public Quiz createQuiz(Quiz quiz) {
        quiz.setId(System.currentTimeMillis()); // Simulating unique ID
        return quizRepository.save(quiz);
    }

    public Quiz getQuizById(Long id) {
        return quizRepository.findById(id).orElse(null);
    }

    // Assignment Submission Methods
    public Submission submitAssignment(Submission submission) {
        submission.setId(System.currentTimeMillis()); // Simulating unique ID
        return submissionRepository.save(submission);
    }

    public Submission gradeSubmission(Long id, String grade, String feedback) {
        Submission submission = submissionRepository.findById(id).orElse(null);
        if (submission != null) {
            submission.setGrade(grade);
            submission.setFeedback(feedback);
        }
        return submission;
    }

    public List<Submission> getSubmissionsForAssignment(Long assignmentId) {
        return submissionRepository.findAllByAssignmentId(assignmentId);
    }
}
