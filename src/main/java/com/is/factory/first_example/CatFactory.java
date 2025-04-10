package com.is.factory.first_example;

public class CatFactory implements AnimalFactory{
    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}
