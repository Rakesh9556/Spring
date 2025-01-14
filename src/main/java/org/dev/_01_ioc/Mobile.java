package org.dev._01_ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Mobile
{
    public static void main( String[] args )
    {
        // Airtel airtel = new Airtel();
        // airtel.calling();
        // airtel.data();

        // Vodafone vodafone = new Vodafone();
        // vodafone.calling();
        // vodafone.data();

        // Here is one problem that if we want to change sim provider in future
        // we need to change the source code everytime which is not good industry practices

        // So we will create objects using interface reference
        // Sim sim = new Airtel();
        // sim.calling();
        // sim.data();


        // Again still here is problem that we still need to change the interface reference to work with different sims
        // we need to make this configurable so that no need to touch the source code for any changes
        // SO here is the concepts of spring IOC will come, spring ioc will:
        // create objects for us and will manage these objects

        // This application context will read the config file and will instantiate objects
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("configuration file loaded");

        // Airtel airtel2 = (Airtel) context.getBean("airtel");
        // Airtel airtel = context.getBean("airtel", Airtel.class);
        // airtel.calling();

        // Instead of using class implementation to create objects use interface implementation for creating objects
        Sim sim = context.getBean("sim", Sim.class);
        sim.calling();
        sim.data();

    }
}
