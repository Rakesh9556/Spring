package org.dev.practise;

public class CallingService implements  Service {

    @Override
    public void service() {
        System.out.println("Calling service activated...");
    }
}
