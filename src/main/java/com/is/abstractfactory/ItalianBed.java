package com.is.abstractfactory;

public class ItalianBed implements Bed {
    @Override
    public void createBad() {
        System.out.println("This is Italian Bed");
    }

    @Override
    public void colorBed() {
        System.out.println("Color is Italian Bed is white");
    }
}
