package com.company;

public class Main {

    public static void main(String[] args) {
            CafeFactory cafeFactory = pourCoffeeByOrder("Американо");
            Barista barista = cafeFactory.createBarista();
            barista.pourCoffee();
        }
    static CafeFactory pourCoffeeByOrder(String name) {

        if (name.equalsIgnoreCase("Американо")) {
            return new AmericanoFactory();
        }
        else if (name.equalsIgnoreCase("Латте")) {
            return new LatteFactory();
        }
        else {
            throw new RuntimeException("Кофе с названием '" + name + "' нет в меню");
        }
    }
}
