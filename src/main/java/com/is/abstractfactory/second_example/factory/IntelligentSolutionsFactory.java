package com.is.abstractfactory.second_example.factory;

import com.is.abstractfactory.second_example.BackEndDeveloper;
import com.is.abstractfactory.second_example.Engineer;
import com.is.abstractfactory.second_example.FrontDeveloper;
import com.is.abstractfactory.second_example.ITCompanyFactory;
import com.is.abstractfactory.second_example.model.*;

public class IntelligentSolutionsFactory implements ITCompanyFactory {
    @Override
    public BackEndDeveloper createBackEndDeveloper(String backEndDeveloperType) {
        if (backEndDeveloperType.equalsIgnoreCase("Java"))
            return new JavaDeveloper();
        else if (backEndDeveloperType.equalsIgnoreCase("php"))
            return new PHPDeveloper();
        else throw new IllegalArgumentException("Invalid Back End Developer Type: " + backEndDeveloperType);
    }

    @Override
    public FrontDeveloper createFrontDeveloper(String frontDeveloperType) {
        if (frontDeveloperType.equalsIgnoreCase("vue"))
            return new VueDeveloper();
        else if (frontDeveloperType.equalsIgnoreCase("react"))
            return new ReactDeveloper();
        else throw new IllegalArgumentException("Invalid Front Developer Type: " + frontDeveloperType);
    }

    @Override
    public Engineer createEngineer() {
        return new QAEngineer();
    }
}
