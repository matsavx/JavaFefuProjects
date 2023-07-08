package com.company;

public class LatteFactory implements CafeFactory{
    @Override
    public Barista createBarista() {
        return new Latte();
    }
}
