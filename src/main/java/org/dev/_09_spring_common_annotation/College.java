package org.dev._09_spring_common_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
// We can also create bean another way without using @Component
public class College {

    // Dependency
    @Autowired
    private Principal principal;

    // we will config this interface dependency
    @Autowired
    @Qualifier("mathTeacher")
    private Teacher teacher; // interface

    // literal dependency
    @Value("${college.name}")
    private String collegeName;

//    public College(Principal principal) {  // constructor injection
//        this.principal = principal;
//    }

//    @Autowired
//    public void setTeacher(Teacher teacher) {
//        this.teacher = teacher;
//    }
//
//    @Autowired
//    public void setPrincipal(Principal principal) {
//        this.principal = principal;
//        System.out.println("Using this setter method to inject the principal dependency into College");
//    }

    public void notice() {
        System.out.println("New notice has been posted on college " + collegeName);
        principal.principalInfo();
        teacher.teach();
    }

}
