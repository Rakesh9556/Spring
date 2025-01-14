package org.dev._03_di_object_type;

public class Student {

    // We want to access the  math cheat method here in the student class
    // How we can do that?

    // Type 1: We can create the object of the math cheat method then can call the mathCheat()
    // MathCheat mathCheat = new MathCheat(); // This is fine but this make tight coupling which is not good in terms of programming context.

    // Type 2: We will only declare it
    private MathCheat mathCheat; // we will initialize this but using dependency injection

    // We will use setter dependency injection
    public void setMathCheat(MathCheat mathCheat) {
        this.mathCheat = mathCheat;
    }



    public void cheating() {
        mathCheat.mathCheat();
    }




}
