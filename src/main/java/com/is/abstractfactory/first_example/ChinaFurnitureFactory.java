package com.is.abstractfactory.first_example;

public class ChinaFurnitureFactory implements FurnitureFactory {
    @Override
    public Bed createBed() {
        return new ChinaBed();
    }

    @Override
    public Table createTable() {
        return new ChinaTable();
    }
}
