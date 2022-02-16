package com.watermanagement.domain.water;

public abstract class Water {
    protected int quantity;

    public Water(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public abstract double getRate();
}
