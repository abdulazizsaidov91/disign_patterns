package com.is.abstractfactory.second_example;

public interface ITCompanyFactory {
    BackEndDeveloper createBackEndDeveloper(String backEndDeveloperType);
    FrontDeveloper createFrontDeveloper(String frontDeveloperType);
    Engineer createEngineer();
}
