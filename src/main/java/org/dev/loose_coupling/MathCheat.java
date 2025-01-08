package org.dev.loose_coupling;

public class MathCheat implements Subject {
    public MathCheat() {
        System.out.println("MathCheat constructor called");
    }

    @Override
    public void cheating() {
        System.out.println("Math Cheating started...");
    }
}
