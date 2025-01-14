package org.dev._06_autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Body {
    @Autowired
    @Qualifier("humanHeart")
    private Heart heart;

    public Body() {
        System.out.println("Body structure created..");
    }

//    @Autowired
    public Body(Heart heart) {
        this.heart = heart;
        System.out.println("Constructor injection happened..");
    }


    public void setHeart(Heart heart) {
        this.heart = heart;
    }

    public void isAlive() {
        if(heart != null) {
            heart.pump();
            System.out.println("Name of animal is: " + heart.getAnimalName() + " and Age is: " + heart.getAge());
        }
        else {
            System.out.println("Heart is not pumping...");
            System.out.println("Dead....");
        }

    }
}
