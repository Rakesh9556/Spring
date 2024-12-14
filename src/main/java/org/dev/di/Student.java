package org.dev.di;

public class Student {

    // This is a literal dependency
    private String studentName;
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void displayStudentInfo() {
        System.out.println("Student Name: " + studentName + ", Age: " + age);
    }
}
