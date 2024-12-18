package com.example.lms.entities;



import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;


@Embeddable
public class EnrollmentID implements Serializable {

    private long userId;
    private int course_Id;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public int getCourse_Id() {
        return course_Id;
    }

    public void setCourse_Id(int course_Id) {
        this.course_Id = course_Id;
    }

    public EnrollmentID(long userId, int course_Id) {
        this.userId = userId;
        this.course_Id = course_Id;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        EnrollmentID that = (EnrollmentID) obj;
        return Objects.equals(userId, course_Id) && Objects.equals(course_Id, userId);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(userId,course_Id);
    }
}
