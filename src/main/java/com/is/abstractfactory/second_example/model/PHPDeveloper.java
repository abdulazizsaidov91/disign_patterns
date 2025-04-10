package com.is.abstractfactory.second_example.model;

import com.is.abstractfactory.second_example.BackEndDeveloper;

public class PHPDeveloper implements BackEndDeveloper {
    @Override
    public void writesBackEndCode() {
        System.out.println("PHP developer writesJavaCode");
    }

    @Override
    public void codeReviewBackEndCode() {
        System.out.println("PHP developer codeReviewJavaCode");
    }
}
