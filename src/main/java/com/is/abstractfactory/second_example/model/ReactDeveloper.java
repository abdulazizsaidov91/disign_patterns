package com.is.abstractfactory.second_example.model;

import com.is.abstractfactory.second_example.FrontDeveloper;

public class ReactDeveloper implements FrontDeveloper {
    @Override
    public void writesFrontCode() {
        System.out.println("React developer write react code");
    }

    @Override
    public void codeReviewFrontCode() {
        System.out.println("React developer code review react code");
    }
}
