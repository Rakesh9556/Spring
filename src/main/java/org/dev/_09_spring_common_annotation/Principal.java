package org.dev._09_spring_common_annotation;

import org.springframework.stereotype.Component;

@Component
public class Principal {

    public void principalInfo() {
        System.out.println("Hi I'm Rakesh your new principal !");
    }
}
