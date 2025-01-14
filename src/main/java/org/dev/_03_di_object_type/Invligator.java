package org.dev._03_di_object_type;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Invligator {
    public static void main(String[] args) {

//        // Instead if manual creating the object we can create objects through spring ioc
//        Student student = new Student();
//
//        // This is an object dependency
//        MathCheat mathCheat = new MathCheat();

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = applicationContext.getBean("stud", Student.class);

        // This matchCheat object dependency will be injected inside the student object along with the setter method

        /* MathCheat mathCheat = applicationContext.getBean("mathCheat", MathCheat.class);

        // Here we are injecting the dependency using setter injection
        student.setMathCheat(mathCheat); */

        student.cheating();


        NewStudent newStudent = applicationContext.getBean("newStud", NewStudent.class);
        newStudent.foundCheating();

    }
}
