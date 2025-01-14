package org.dev._09_spring_common_annotation;

import org.springframework.stereotype.Component;

@Component
public class MathTeacher implements Teacher {

    @Override
    public void teach() {
        System.out.println("Hi I am your math teacher...");
        System.out.println("My name is Sourav...");
    }
}
