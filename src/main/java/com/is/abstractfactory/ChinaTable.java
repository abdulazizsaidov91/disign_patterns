package com.is.abstractfactory;

public class ChinaTable implements Table{
    @Override
    public void createTable() {
        System.out.println("This is China Table");
    }
}
