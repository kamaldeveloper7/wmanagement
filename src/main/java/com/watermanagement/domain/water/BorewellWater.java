package com.watermanagement.domain.water;

public class BorewellWater extends Water {

    private double rate;

    public BorewellWater(double rate, int qty) {
        super(qty);
        this.rate = rate;
    }

    public double getRate() {
        return this.rate * this.quantity;
    }
}
