package com.is.abstractfactory;

public class ChinaBed implements Bed {
    @Override
    public void createBad() {
        System.out.println("This is China Bed");
    }

    @Override
    public void colorBed() {
        System.out.println("Color is China Bed is black");
    }
}
