package org.dev.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Student student1 = context.getBean("student1", Student.class);

        // This will inject studentName dependency using setter method
        // student.setStudentName("Rakesh G");
        student1.displayStudentInfo();

        Student student2 = context.getBean("student2", Student.class);
        student2.displayStudentInfo();

    }
}
