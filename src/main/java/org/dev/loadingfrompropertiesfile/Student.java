package org.dev.loadingfrompropertiesfile;

import org.springframework.beans.factory.annotation.Value;

public class Student {
    // We can also use @Value annotation here to inject dependency
    // If we use annotation here we don't required setter methods
    // Spring will automatically inject dependency

    @Value("${student.name}") // this is dynamic value loading from property file
    private String name;
    @Value("${student.interestedCourse}")
    private String interestedCourse;
//    @Value("${student.hobby}")
    private String hobby;


    // @Value("Rajesh Guru")  // these are static values
    // @Value("${student.name}") // this is dynamic value loading from property file
//    public void setName(String name) {
//        this.name = name;
//    }
//
//
//    // @Value("Entrepreneurship")
//    // @Value("${student.interestedCourse}")
//    public void setInterestedCourse(String interestedCourse) {
//        this.interestedCourse = interestedCourse;
//    }
//
//    // @Value("Business")
//    // @Value("${student.hobby}")
//    public void setHobby(String hobby) {
//        this.hobby = hobby;
//    }

    public void displayStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Interested Course: " + interestedCourse);
        System.out.println("Hobby: " + hobby);
    }

}
