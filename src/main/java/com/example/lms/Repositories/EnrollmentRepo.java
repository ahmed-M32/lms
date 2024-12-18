package com.example.lms.Repositories;

import com.example.lms.models.Enrollment;
import com.example.lms.models.EnrollmentID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnrollmentRepo extends JpaRepository<Enrollment, EnrollmentID>, EnrollmentC1Repo {


}
