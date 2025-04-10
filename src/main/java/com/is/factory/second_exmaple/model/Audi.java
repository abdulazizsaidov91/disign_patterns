package com.is.factory.second_exmaple.model;

import com.is.factory.second_exmaple.Car;

public class Audi implements Car {

    @Override
    public void maxSpeed() {
        System.out.println("Max speed Audi 300");
    }

    @Override
    public void type() {
        System.out.println("Type Audi Sedan");
    }

    @Override
    public void horsepower() {
        System.out.println("Horsepower Audi 500");
    }
}
