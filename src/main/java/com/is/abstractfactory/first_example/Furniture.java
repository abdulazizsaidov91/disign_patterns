package com.is.abstractfactory.first_example;

public class Furniture {
    public static void main(String[] args) {
        FurnitureFactory furnitureFactory = new ChinaFurnitureFactory();
        furnitureFactory.createBed().createBad();
        furnitureFactory.createTable().createTable();
    }
}
