package com.is.abstractfactory;

public class Furniture {
    public static void main(String[] args) {
        FurnitureFactory furnitureFactory = new ChinaFurnitureFactory();
        furnitureFactory.createBed().createBad();
        furnitureFactory.createTable().createTable();
    }
}
