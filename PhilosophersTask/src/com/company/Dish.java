package com.company;

import java.util.concurrent.locks.ReentrantLock;

public class Dish {
    private final ReentrantLock dish = new ReentrantLock();

    public Dish(){}

    public void eat(Philosopher philosopher) throws InterruptedException {
        this.dish.lock();
        System.out.println(philosopher.getPhilosopherName() + " начал есть");
        philosopher.setFood();
        Thread.sleep(3000);
        System.out.println(philosopher.getPhilosopherName() + " закончил есть. Он съел " + philosopher.getFood() + " порций риса");
        this.dish.unlock();
    }
}