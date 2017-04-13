package com.designpatterns.factory;

/**
 * Created by Chethan on 12/04/17.
 */
public abstract  class Plan {
    protected double rate;
    public abstract void getRate();

    public void printRate() {
        System.out.println("Rate is : " + rate);
    }
}
