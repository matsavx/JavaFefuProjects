package com.company;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("SnowBall");
        System.out.println(dog.getName() + " says: " + dog.speak());

        Cat cat = new Cat("Honey");
        System.out.println(cat.getName() + " says: " + cat.speak());

        LoudDog loudDog = new LoudDog("Loudy");
        System.out.println(loudDog.getName() + " says: " + loudDog.speak());
    }
}