package org.dev._09_spring_common_annotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ScienceTeacher implements Teacher {

    @Override
    public void teach() {
        System.out.println("Hi I am your science teacher...");
        System.out.println("My name is Gourav...");
    }
}
