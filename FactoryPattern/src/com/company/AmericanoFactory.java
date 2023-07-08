package com.company;

public class AmericanoFactory implements CafeFactory{
    @Override
    public Barista createBarista() {
        return new Americano();
    }
}
