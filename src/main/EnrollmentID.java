package com.example.lms.entities;



import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Data;

import java.io.Serializable;

@Data
@Embeddable
public class EnrollmentID implements Serializable {
    @OneToOne
    @JoinColumn(name = "user_Id", referencedColumnName = "ID")
    private long userId;

    @ManyToOne
    @JoinColumn(name = "course_Id", referencedColumnName = "courseId")
    private int course_Id;

}
