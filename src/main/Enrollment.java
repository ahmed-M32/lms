package com.example.lms.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class Enrollment {
    @EmbeddedId
   private EnrollmentID enrollmentID;

    @ManyToOne
    @MapsId("userId")
    @JoinColumn(name="user_Id")
    private User Course;

    @ManyToOne
    @MapsId("course_Id")
    @JoinColumn(name="course_Id")
    private Course User;

    String enrollmentDate;

    public Enrollment(EnrollmentID enrollmentID, com.example.lms.entities.User course, com.example.lms.entities.Course user, String enrollmentDate) {
        this.enrollmentID = enrollmentID;
        Course = course;
        User = user;
        this.enrollmentDate = enrollmentDate;
    }

    public EnrollmentID getEnrollmentID() {
        return enrollmentID;
    }

    public void setEnrollmentID(EnrollmentID enrollmentID) {
        this.enrollmentID = enrollmentID;
    }

    public com.example.lms.entities.User getCourse() {
        return Course;
    }

    public void setCourse(com.example.lms.entities.User course) {
        Course = course;
    }

    public com.example.lms.entities.Course getUser() {
        return User;
    }

    public void setUser(com.example.lms.entities.Course user) {
        User = user;
    }

    public String getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(String enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

}
