package com.is.abstractfactory.second_example;

import com.is.abstractfactory.second_example.factory.IntelligentSolutionsFactory;

public class ClientClass {
    public static void main(String[] args) {
        ITCompanyFactory itCompanyFactory = new IntelligentSolutionsFactory();
        BackEndDeveloper backEndDeveloper = itCompanyFactory.createBackEndDeveloper("php");
        backEndDeveloper.writesBackEndCode();
        backEndDeveloper.codeReviewBackEndCode();


        FrontDeveloper frontDeveloper = itCompanyFactory.createFrontDeveloper("react");
        frontDeveloper.writesFrontCode();
        frontDeveloper.codeReviewFrontCode();

        Engineer engineer = itCompanyFactory.createEngineer();
        engineer.testes();
        engineer.checkMistakes();
    }
}
