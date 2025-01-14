package org.dev._05_practise;

public class Vodafone implements Sim {

    Service service;

    public void setService(Service service) {
        this.service = service;
    }

    public void startService() {
        service.service();
    }

    @Override
    public void activateSim() {
        System.out.println("Vodafone service started");
        startService();
    }


}
