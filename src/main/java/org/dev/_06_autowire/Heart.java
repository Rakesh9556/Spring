package org.dev._06_autowire;

public class Heart {

    private String animalName;
    private int age;

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAnimalName() {
        return animalName;
    }

    public int getAge() {
        return age;
    }

    public Heart() {
        System.out.println("Heart structure created...");
    }

    public void pump() {
        System.out.println("Heart is pumping....");
        System.out.println("Alive....");
    }

}
