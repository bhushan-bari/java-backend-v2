package com.bhushan.javabackend.module04;

class CourseEnrollment {

    int studentId;
    String studentName;
    String courseName;
    double courseFee;

    CourseEnrollment(int studentId, String studentName,
                     String courseName, double courseFee) {

        this.studentId = studentId;
        this.studentName = studentName;
        this.courseName = courseName;
        this.courseFee = courseFee;
    }

    CourseEnrollment(int studentId, String studentName,
                     String courseName) {

        this.studentId = studentId;
        this.studentName = studentName;
        this.courseName = courseName;
        this.courseFee = 5000;
    }

    void displayEnrollment() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Course: " + courseName);
        System.out.println("Course Fee: " + courseFee);
        System.out.println();
    }
}

public class CourseEnrollmentDemo {

    public static void main(String[] args) {

        CourseEnrollment enrollment1 =
                new CourseEnrollment(
                        101, "Rahul", "Java Backend", 7500);

        CourseEnrollment enrollment2 =
                new CourseEnrollment(
                        102, "Priya", "Spring Boot", 8000);

        CourseEnrollment enrollment3 =
                new CourseEnrollment(
                        103, "Amit", "SQL");

        enrollment1.displayEnrollment();
        enrollment2.displayEnrollment();
        enrollment3.displayEnrollment();
    }
}
