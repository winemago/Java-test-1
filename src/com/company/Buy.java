package com.company;

public class Buy {
    private double Amount;
    private Property land;
    private Owner newOwner;

    public Buy(double amount, Property land, Owner newOwner) {
        Amount = amount;
        this.land = land;
        this.newOwner = newOwner;
    }

    public double getAmount() {
        return Amount;
    }

    @Override
    public String toString() {
        return "Buy{" +
                "Amount=" + Amount +
                ", land=" + land +
                ", newOwner=" + newOwner +
                '}';
    }
}
