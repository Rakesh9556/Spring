package org.dev.spring_common_annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Administration {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(CollegeConfig.class);
        System.out.println("Config file loaded...");
        College college = applicationContext.getBean("college", College.class);
        System.out.println("College object created: " + college);
        college.notice();
        applicationContext.close();

        



    }
}
