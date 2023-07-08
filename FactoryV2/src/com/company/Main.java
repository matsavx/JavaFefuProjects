package com.company;

public class Main {

    public static void main(String[] args) {
        CafeFactory cafeFactory = new CafeFactory();
        System.out.println(cafeFactory.pourCoffeeByOrder(CafeMenu.AMERICANO));
    }
}
