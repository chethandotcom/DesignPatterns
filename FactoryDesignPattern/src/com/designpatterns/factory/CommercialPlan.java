package com.designpatterns.factory;

/**
 * Created by Chethan on 12/04/17.
 */
public class CommercialPlan extends Plan {
    public CommercialPlan() {
        System.out.println("Commercial");
    }

    @Override
    public void getRate() {
        // Settings custom rate
        rate = 6.5;
    }
}
