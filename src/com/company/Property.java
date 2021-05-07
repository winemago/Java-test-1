package com.company;

public class Property {
    private double squaremeters;
    private Owner landlord;
    private double amount;

    public Property(double squaremeters, Owner landlord, double amount) {
        this.squaremeters = squaremeters;
        this.landlord = landlord;
        this.amount = amount;
    }

    public double getSquaremeters() {
        return squaremeters;
    }

    public void setSquaremeters(double squaremeters) {
        this.squaremeters = squaremeters;
    }

    public Owner getLandlord() {
        return landlord;
    }

    public void setLandlord(Owner landlord) {
        this.landlord = landlord;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void purchase(Owner newOwner, double cost){                         //3
        setLandlord(newOwner);
        setAmount(cost);
        System.out.println("the new owner now is: " + getLandlord() + "for" + getAmount());
    }


    @Override
    public String toString() {
        return "Property{" +
                "squaremeters=" + squaremeters +
                ", landlord=" + landlord +
                '}';
    }
}
