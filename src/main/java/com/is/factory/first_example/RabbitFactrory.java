package com.is.factory.first_example;

public class RabbitFactrory implements AnimalFactory{
    @Override
    public Animal createAnimal() {
        return new Rabbit();
    }
}
