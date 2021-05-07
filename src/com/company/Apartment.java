package com.company;

public class Apartment extends Property{
    private int floorNumber;
    private char floorLetter;

    public Apartment(double squaremeters, Owner landlord, int floorNumber, char floorLetter, double amount) {
        super(squaremeters, landlord, amount);
        this.floorNumber = floorNumber;
        this.floorLetter = floorLetter;
    }

    @Override
    public String toString() {
        return "Apartments{" + super.toString() +
                "floorNumber=" + floorNumber +
                ", floorLetter=" + floorLetter +
                '}';
    }
}
