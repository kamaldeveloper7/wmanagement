package com.watermanagement.domain.water;

public class WaterRange {
    private int start;
    private int end;
    private double price;

    public WaterRange(int start, int end, double price) {
        this.start = start;
        this.end = end;
        this.price = price;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    public double getPrice() {
        return price;
    }
}
