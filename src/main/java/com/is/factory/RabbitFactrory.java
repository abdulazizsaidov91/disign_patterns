package com.is.factory;

public class RabbitFactrory implements AnimalFactory{
    @Override
    public Animal createAnimal() {
        return new Rabbit();
    }
}
