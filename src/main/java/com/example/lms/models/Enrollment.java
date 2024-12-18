package com.example.lms.models;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
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
    @JoinColumn(name = "userId")
    private User user;

    @ManyToOne
    @MapsId("courseId")
    @JoinColumn(name = "courseId")
    private Course1 course;

    private String enrollmentDate;

    public Enrollment(EnrollmentID enrollmentID, User user, Course1 course, String enrollmentDate) {
        this.enrollmentID = enrollmentID;
        this.user = user;
        this.course = course;
        this.enrollmentDate = enrollmentDate;
    }

    public Enrollment() {

    }
}
