package com.designpatterns.factory;

/**
 * Created by Chethan on 12/04/17.
 */
public class DomesticPlan extends Plan {
    public DomesticPlan() {
        System.out.println("Domestic");
    }

    @Override
    public void getRate() {
        // Settings custom rate
        rate = 3.5;
    }
}
