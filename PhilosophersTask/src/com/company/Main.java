package com.company;

public class Main {

    public static void main(String[] args) {
        Dish dish = new Dish();
        Philosopher philosopher = new Philosopher("Филосов Матвей", dish);
        Philosopher philosopher1 = new Philosopher("Философ Слава", dish);
        Philosopher philosopher2 = new Philosopher("Философ Миша", dish);

        Thread first = new Thread(philosopher);
        Thread second = new Thread(philosopher1);
        Thread third = new Thread(philosopher2);

        first.start();
        second.start();
        third.start();
    }
}
