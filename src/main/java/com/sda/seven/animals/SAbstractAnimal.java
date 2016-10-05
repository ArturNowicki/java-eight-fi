package com.sda.seven.animals;

public abstract class SAbstractAnimal implements SVocalAnimal {

    @Override
    public void makeSound() {
        System.out.println("Default animal sound in Java 7");
    }

}
