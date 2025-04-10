package com.is.abstractfactory.first_example;

public class ItalianTable implements Table {
    @Override
    public void createTable() {
        System.out.println("This is Italian Table");
    }
}
