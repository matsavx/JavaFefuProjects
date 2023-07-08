package com.company;

import java.util.Random;

public class Philosopher extends Thread {
    private final String name;
    private int food;
    private final Dish dish;

    public Philosopher(String name, Dish dish){
        this.name = name;
        this.food = 0;
        this.dish = dish;
    }
    public String getPhilosopherName() {
        return this.name;
    }
    public int getFood() {
        return this.food;
    }
    public void setFood() {
        this.food++;
    }

    private void think() throws InterruptedException {
        Random value = new Random();
        int sleepTime = value.ints(1000, 8000).findFirst().orElse(0);
        Thread.sleep(sleepTime);
    }

    public void run() {
        while (true) {
            try {
                System.out.println(this.name + " думает");
                this.think();
                System.out.println(this.name + " прекратил думать");
            } catch (InterruptedException Ex1) {
                Ex1.printStackTrace();
            }
            try {
                this.dish.eat(this);
            } catch (InterruptedException Ex2) {
                Ex2.printStackTrace();
            }
        }
    }
}
