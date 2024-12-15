#Resources
  ##Spring boot
    https://youtu.be/9SGDpanrc8U?si=LvWns4CMMN8LcNBO
  ##RESTful api 
    https://youtu.be/YVl6M5ztOu8?si=2jPc1LN4hZXDesL1
  ##JPA
    https://youtu.be/8SGI_XS5OPw?si=PpvGj7LF26AwRldv
  ##JWT
    https://youtu.be/X80nJ5T7YpE?si=4i8RJc9s2ObqnhVU
    https://youtu.be/KxqlJblhzfI?si=kWQyduM_SOUdt2xm

#Task Assignment (Based on AD)
##Conceptual Viewpoint: User Management and Role-Based Authentication

##Assigned to: Member 1
Tasks (aligned with the AD):
Implement user registration and login with Spring Security (Admin, Instructor, Student roles).
Develop APIs for profile management and role-based access control.
Ensure secure handling of authentication and authorization.
Deliverables:
Role-based authentication APIs.
Documentation of user roles and permissions.
Unit tests for role-based functionality.
Conceptual Viewpoint: Course and Enrollment Management

##Assigned to: Member 2
Tasks (aligned with the AD):
Develop APIs for course creation, media uploads, and lesson management.
Implement enrollment management for students and instructors.
Add functionality for tracking enrolled students per course.
Deliverables:
RESTful APIs for course operations.
Database schema updates for course-related tables.
Unit and integration tests for course enrollment workflows.
Conceptual and Deployment Viewpoints: Assessment and Grading

##Assigned to: Member 3
Tasks (aligned with the AD):
Implement functionality for quiz creation and randomized questions.
Develop APIs for assignment submissions and grading workflows.
Integrate feedback mechanisms for quizzes and assignments.
Deliverables:
RESTful APIs for assessments and grading.
Updates to the entity-relationship diagram (ERD) for assessment data.
Test cases for assessment workflows.
Conceptual Viewpoint: Notifications and Performance Tracking

##Assigned to: Member 4
Tasks (aligned with the AD):
Build notification APIs for enrollment updates, grading, and system events.
Implement progress tracking for students (scores, attendance, and course completion).
Extend notification features to email integration as described in the AD.
Deliverables:
Notification APIs (system and email).
Dashboard for performance metrics.
Documentation on notification and tracking architecture.
Deployment Viewpoint: Backend Integration and Deployment

##Assigned to: Member 5
Tasks (aligned with the AD):
Design and implement the database schema using MySQL.
Integrate and test all backend components.
Prepare deployment configurations using Docker and GitHub workflows.
Deliverables:
Fully integrated source code.
Deployment-ready Docker scripts.
Final integrated ERD and deployment diagrams.







# Folder Structure
lms-backend/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── yourorganization/
│   │   │           └── lms/
│   │   │               ├── config/
│   │   │               ├── controller/
│   │   │               ├── dto/
│   │   │               ├── entity/
│   │   │               ├── exception/
│   │   │               ├── repository/
│   │   │               ├── service/
│   │   │               ├── util/
│   │   │               └── LmsApplication.java
│   │   ├── resources/
│   │   │   ├── static/
│   │   │   ├── templates/
│   │   │   ├── application.properties
│   │   │   └── application-dev.properties
│   │   └── webapp/ (Optional - If using JSP)
│   └── test/
│       └── java/
│           └── com/
│               └── yourorganization/
│                   └── lms/
│                       └── (test classes here)
├── pom.xml
└── README.md
