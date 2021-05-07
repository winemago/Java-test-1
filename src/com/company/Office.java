package com.company;

public class Office extends Property{
    private int boxes;

    public Office(double squaremeters, Owner landlord, int boxes, double amount) {
        super(squaremeters, landlord, amount);
        this.boxes = boxes;
    }

    @Override
    public String toString() {
        return "Office{" +super.toString() +
                "boxes=" + boxes +
                '}';
    }
}
