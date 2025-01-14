package org.dev._02_di;

public class Student {

    // This is a literal dependency
    private String studentName;
    private int age;

    public void setStudentName(String studentName) {
        if(studentName == null || studentName.isEmpty()) {
            throw new IllegalArgumentException("Student name cannot be null or empty");
        }
        this.studentName = studentName;
    }

    public void setAge(int age) {
        if(age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.age = age;
    }

    // This is a type of constructor dependency and to inject it we need to explicitly set the values in the config file
    // to allow Spring to inject values in this dependency automatically
    public Student(String studentName, int age) {
        this.studentName = studentName;
        this.age = age;
    }

    public Student(int age) {
        this.age = age;
    }


    public void displayStudentInfo() {
        System.out.println("Student Name: " + studentName + ", Age: " + age);
    }
}
