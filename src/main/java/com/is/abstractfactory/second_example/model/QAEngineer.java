package com.is.abstractfactory.second_example.model;

import com.is.abstractfactory.second_example.Engineer;

public class QAEngineer implements Engineer {
    @Override
    public void testes() {
        System.out.println("QAEngineer write testes");
    }

    @Override
    public void checkMistakes() {
        System.out.println("QAEngineer check mistakes");
    }
}
