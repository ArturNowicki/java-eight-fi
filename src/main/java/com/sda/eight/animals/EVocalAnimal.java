package com.sda.eight.animals;

public interface EVocalAnimal {
    
    default void makeSound() {
        System.out.println("Java 8 default animal sound.");
    }

}
