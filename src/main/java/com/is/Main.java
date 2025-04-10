package com.is;

import com.is.factory.first_example.AnimalFactory;
import com.is.factory.first_example.CatFactory;
import com.is.factory.first_example.DogFactory;
import com.is.factory.first_example.RabbitFactrory;

public class Main {
    public static void main(String[] args) {
        AnimalFactory animalFactory = animalFactory("rabbit");
        animalFactory.createAnimal().voice();
    }

    private static AnimalFactory animalFactory(String name){
        if (name.equalsIgnoreCase("dog"))
            return new DogFactory();
        else if (name.equalsIgnoreCase("cat"))
            return new CatFactory();
        else if (name.equalsIgnoreCase("rabbit"))
            return new RabbitFactrory();
        else throw new IllegalArgumentException("Invalid animal type");
    }
}