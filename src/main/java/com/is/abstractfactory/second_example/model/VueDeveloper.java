package com.is.abstractfactory.second_example.model;

import com.is.abstractfactory.second_example.FrontDeveloper;

public class VueDeveloper implements FrontDeveloper {
    @Override
    public void writesFrontCode() {
        System.out.println("VueDeveloper writesVueAndJSCode");
    }

    @Override
    public void codeReviewFrontCode() {
        System.out.println("VueDeveloper codeReviewVueAndJCCode");
    }
}
