package com.company;

public class Rent {
    private Owner renter;
    private double deposit;
    private int period;
    private Property land;

    public Rent(Owner renter, double deposit, int period, Property land) {
        this.renter = renter;
        this.deposit = deposit;
        this.period = period;
        this.land = land;
    }

    public Owner getRenter() {
        return renter;
    }

    public void setRenter(Owner renter) {
        this.renter = renter;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public Property getLand() {
        return land;
    }

    public void setLand(Property land) {
        this.land = land;
    }

    public void Increase10(Rent r){                 //5
        double a = r.getDeposit()*1.10;
        setDeposit(a);
    }
    @Override
    public String toString() {
        return "Rent{" +
                "renter=" + renter +
                ", deposit=" + deposit +
                ", period=" + period +
                ", land=" + land +
                '}';
    }
}
