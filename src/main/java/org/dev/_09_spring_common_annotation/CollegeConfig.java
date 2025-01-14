package org.dev._09_spring_common_annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "org.dev._09_spring_common_annotation")
// there is no need of @ComponentScan as we are not using @Component to register bean
@PropertySource("classpath:college-info.properties") // to inject literal value dependencies we need to configure property file
public class CollegeConfig {

    /*
    // @Bean
    // @Bean(name = "college") // we can override the bean name
    @Bean(name = {"college", "colBean", "collegeBean"}) // we can also set multiple names
    public College college() {  // method name --> bean id
        return new College();
    }
    */

    // Injecting principal dependency to college class

    // Constructor injection
    /*
    @Bean
    public Principal principal() {
        return new Principal();
    }

    @Bean
    public College college() {  // method name --> bean id
        return new College(principal()); // call the principal method here to inject the principal object
    }
    */


    // Setter injection
    /*
    @Bean
    public Principal principal() {
        return new Principal();
    }

    @Bean
    public College college() {  // method name --> bean id
        College college = new College();
        college.setPrincipal(principal()); // inject the principal dependency by calling setter method
        college.setTeacher(mathTeacher()); // inject the teacher dependency by calling setter method
        return college;
    }

    public Teacher mathTeacher() {
       Teacher teacher = new MathTeacher();
       return teacher;
    }
    */


}
