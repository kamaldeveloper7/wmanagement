package com.watermanagement.domain.water;

public class CorporationWater extends Water {
    private double rate;

    public CorporationWater(double rate, int quantity) {
        super(quantity);
        this.rate = rate;
    }

    public double getRate() {
        return this.rate;
    }
}
