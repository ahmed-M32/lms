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






}
