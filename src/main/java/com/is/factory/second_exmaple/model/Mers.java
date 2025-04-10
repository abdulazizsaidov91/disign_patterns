package com.is.factory.second_exmaple.model;

import com.is.factory.second_exmaple.Car;

public class Mers implements Car {
    @Override
    public void maxSpeed() {
        System.out.println("Max Speed Mers 350");
    }

    @Override
    public void type() {
        System.out.println("Type Mers Pikap");
    }

    @Override
    public void horsepower() {
        System.out.println("Horsepower Mers 800");
    }
}
