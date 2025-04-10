package com.is.abstractfactory.second_example.model;

import com.is.abstractfactory.second_example.BackEndDeveloper;

public class JavaDeveloper implements BackEndDeveloper {
    @Override
    public void writesBackEndCode() {
        System.out.println("JavaDeveloper writesJavaCode");
    }

    @Override
    public void codeReviewBackEndCode() {
        System.out.println("JavaDeveloper codeReviewJavaCode");
    }
}
