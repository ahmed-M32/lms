package com.example.lms.Repositories;


import com.example.lms.entities.Enrollment;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EnrollmentC1Imp implements EnrollmentC1Repo{
    private final EnrollmentRepo eRepo;

    @Autowired
    public EnrollmentC1Imp(EnrollmentRepo eRepo)
    {
        this.eRepo = eRepo;
    }

}
