package org.dev._04_loose_coupling;

public class ScienceCheat implements Subject {
    public ScienceCheat() {
        System.out.println("ScienceCheat constructor called");
    }

    @Override
    public void cheating() {
        System.out.println("Science cheating started...");
    }
}
