package com.is.factory.first_example;

public class DogFactory implements AnimalFactory{
    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}
