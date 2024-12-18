package com.example.lms.Repositories;

import com.example.lms.models.Submission;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class SubmissionRepo {

    private final List<Submission> submissions = new ArrayList<>();

    public Submission save(Submission submission) {
        submissions.add(submission);
        return submission;
    }

    public Optional<Submission> findById(Long id) {
        return submissions.stream().filter(s -> s.getId().equals(id)).findFirst();
    }

    public List<Submission> findAllByAssignmentId(Long assignmentId) {
        List<Submission> result = new ArrayList<>();
        for (Submission s : submissions) {
            if (s.getAssignmentId().equals(assignmentId)) {
                result.add(s);
            }
        }
        return result;
    }
}
