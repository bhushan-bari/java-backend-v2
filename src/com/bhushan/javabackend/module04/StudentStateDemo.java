package com.bhushan.javabackend.module04;

class Student {

    int studentId;
    String studentName;
    String course;
    double marks;

    Student(int studentId, String studentName,
            String course, double marks) {

        this.studentId = studentId;
        this.studentName = studentName;
        this.course = course;
        this.marks = marks;
    }

    void updateMarks(double marks) {
        this.marks = marks;
    }

    void displayStudent() {
        System.out.println("Student ID: " + this.studentId);
        System.out.println("Student Name: " + this.studentName);
        System.out.println("Course: " + this.course);
        System.out.println("Marks: " + this.marks);
        System.out.println();
    }
}

public class StudentStateDemo {

    public static void main(String[] args) {

        Student student1 =
                new Student(101, "Amit", "Java", 75);

        Student student2 =
                new Student(102, "Sumit", "SQL", 82);

        System.out.println("Before update:");

        student1.displayStudent();
        student2.displayStudent();

        student1.updateMarks(85);

        System.out.println("After update:");

        student1.displayStudent();
        student2.displayStudent();
    }
}
