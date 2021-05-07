package com.company;

public class House extends Property{
    private int floors;

    public House(double squaremeters, Owner landlord, int floors, double amount) {
        super(squaremeters, landlord, amount);
        this.floors = floors;
    }

    @Override
    public String toString() {
        return "House{" +super.toString() +
                "floors=" + floors +
                '}';
    }
}
