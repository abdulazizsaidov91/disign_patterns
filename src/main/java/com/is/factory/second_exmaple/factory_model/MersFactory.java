package com.is.factory.second_exmaple.factory_model;

import com.is.factory.second_exmaple.Car;
import com.is.factory.second_exmaple.CarFactory;
import com.is.factory.second_exmaple.model.Mers;

public class MersFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Mers();
    }
}
