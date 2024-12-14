package org.dev.ioc;

public class Vodafone implements Sim {

    public Vodafone() {
        // System.out.println("Vodafone sim is used for calling and internet");
    }

    @Override
    public void calling() {
        System.out.println("Calling using Vodafone");
    }

    @Override
    public void data() {
        System.out.println("Browsing internet using Vodafone");
    }
}
