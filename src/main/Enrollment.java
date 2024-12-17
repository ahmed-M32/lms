package com.example.lms.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Enrollment {
    @EmbeddedId
    EnrollmentID enrollmentID;


    @ManyToMany
    @MapsId("user_Id")
    @JoinColumn(name="user_Id")
    private Long user_Id;


    @OneToMany
    @MapsId("course_Id")
    @JoinColumn(name="course_Id")
    private int courseID;

    String enrollmentDate;
    public EnrollmentID getEnrollmentID() {
        return enrollmentID;
    }

    public void setEnrollmentID(EnrollmentID enrollmentID) {
        this.enrollmentID = enrollmentID;
    }

    public Long getUser_Id() {
        return user_Id;
    }

    public void setUser_Id(Long user_Id) {
        this.user_Id = user_Id;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public String getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(String enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }


    public Enrollment(EnrollmentID enrollmentID, Long user_Id, int courseID, String enrollmentDate) {
        this.enrollmentID = enrollmentID;
        this.user_Id = user_Id;
        this.courseID = courseID;
        this.enrollmentDate = enrollmentDate;
    }




}
