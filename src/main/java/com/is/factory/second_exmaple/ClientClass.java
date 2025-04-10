package com.is.factory.second_exmaple;

import com.is.factory.second_exmaple.factory_model.AudiFactory;
import com.is.factory.second_exmaple.factory_model.BMWFactory;
import com.is.factory.second_exmaple.factory_model.MersFactory;

public class ClientClass {
    public static void main(String[] args) {
        CarFactory carFactory = carFactory("bmw");
        carFactory.createCar().maxSpeed();
        carFactory.createCar().type();
        carFactory.createCar().horsepower();
    }

    private static CarFactory carFactory(String name) {
        if (name.equalsIgnoreCase("MERS"))
            return new MersFactory();
        else if (name.equalsIgnoreCase("BMW"))
            return new BMWFactory();
        else if (name.equalsIgnoreCase("AUDI"))
            return new AudiFactory();
        else throw new RuntimeException("Unknown Car model");
    }
}
