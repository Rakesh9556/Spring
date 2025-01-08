package org.dev.loose_coupling;


public class Student {

    private Subject cheat;

    public void setCheat(Subject cheat) {
        this.cheat = cheat;
    }

    public void cheating() {
        cheat.cheating();
    }




}
