package com.is.abstractfactory.first_example;

public class ItalianFurnitureFactory implements FurnitureFactory {
    @Override
    public Bed createBed() {
        return new ItalianBed();
    }

    @Override
    public Table createTable() {
        return new ItalianTable();
    }
}
