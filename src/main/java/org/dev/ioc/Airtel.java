package org.dev.ioc;

public class Airtel implements Sim {

    public Airtel() {
        System.out.println("Airtel sim is used for calling and data.");
    }
    @Override
    public void calling() {
        System.out.println("Calling using Airtel");
    }

    @Override
    public void data() {
        System.out.println("Browsing internet using Airtel");
    }
}
