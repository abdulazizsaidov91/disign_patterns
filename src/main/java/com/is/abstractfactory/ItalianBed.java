package com.is.abstractfactory;

public class ItalianBed implements Bed {
    @Override
    public void createBad() {
        System.out.println("This is Italian Bed");
    }
}
