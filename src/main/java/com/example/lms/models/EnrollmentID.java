package com.example.lms.models;



import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Embeddable;


@Embeddable
public class EnrollmentID implements Serializable {

    private long userId;
    private int courseId;

    public EnrollmentID() {

    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public int getCourse_Id() {
        return courseId;
    }

    public void setCourse_Id(int course_Id) {
        this.courseId = course_Id;
    }

    public EnrollmentID(long userId, int course_Id) {
        this.userId = userId;
        this.courseId = course_Id;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        EnrollmentID that = (EnrollmentID) obj;
        return Objects.equals(userId, courseId) && Objects.equals(courseId, userId);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(userId,courseId);
    }
}
