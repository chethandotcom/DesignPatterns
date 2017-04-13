package com.designpatterns.factory;

/**
 * Created by Chethan on 12/04/17.
 */
public class InstitutionalPlan extends Plan {
    public InstitutionalPlan() {
        System.out.println("Institutional");
    }

    @Override
    public void getRate() {
        // Settings custom rate
        rate = 8.5;
    }
}
