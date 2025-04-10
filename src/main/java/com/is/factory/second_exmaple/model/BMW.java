package com.is.factory.second_exmaple.model;

import com.is.factory.second_exmaple.Car;

public class BMW implements Car {
    @Override
    public void maxSpeed() {
        System.out.println("Max Speed Audi 320");
    }

    @Override
    public void type() {
        System.out.println("Type BMW Sedan");
    }

    @Override
    public void horsepower() {
        System.out.println("Horsepower BMW 720");
    }
}
