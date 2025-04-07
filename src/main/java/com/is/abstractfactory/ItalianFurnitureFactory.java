package com.is.abstractfactory;

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
