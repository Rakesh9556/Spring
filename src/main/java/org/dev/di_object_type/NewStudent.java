package org.dev.di_object_type;

public class NewStudent {

    // Injecting this dependency using setter injection
    public MathCheat mathCheat;

    // So we need to create a setter method for injecting dependency
    public void setMathCheat(MathCheat mathCheat) {
        this.mathCheat = mathCheat;
    }

    public void foundCheating() {
        mathCheat.mathCheat();
    }

}
