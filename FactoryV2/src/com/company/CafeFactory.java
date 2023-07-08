package com.company;

public class CafeFactory {
    public Coffee pourCoffeeByOrder(CafeMenu name) {
        Coffee coffee = null;

        switch (name) {
            case AMERICANO:
                coffee = new Americano();
                break;
            case LATTE:
                coffee = new Latte();
        }
        coffee.grindCoffee();
        coffee.makeCoffee();
        coffee.pourIntoCup();

        return coffee;
    }
}
