package com.designpatterns;

import com.designpatterns.factory.Plan;
import com.designpatterns.factory.PlanFactory;

public class Playground {
    /* main starts */
    public static void main(String[] args) {
        // Creating Intitutional Object without knowing the class name
        Plan planInstitutional = PlanFactory.valueOf("Institutional").factory.get();
        planInstitutional.getRate();
        planInstitutional.printRate();

        // Creating Intitutional Object without knowing the class name
        Plan planCommercial = PlanFactory.valueOf("Commercial").factory.get();
        planCommercial.getRate();
        planCommercial.printRate();

        // Creating Intitutional Object without knowing the class name
        Plan planDomestic = PlanFactory.valueOf("Domestic").factory.get();
        planDomestic.getRate();
        planDomestic.printRate();
    }
    /* main ends */
}
