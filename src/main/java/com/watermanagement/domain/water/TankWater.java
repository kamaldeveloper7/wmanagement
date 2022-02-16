package com.watermanagement.domain.water;

import java.util.HashMap;
import java.util.Map;


public class TankWater extends Water {
    private HashMap<WaterRange, Double> waterRangeMap;

    public TankWater(HashMap<WaterRange, Double> waterRangeMap, int qty) {
        super(qty);
        this.waterRangeMap = waterRangeMap;
    }

    public double getRate() {
        double totalRate = 0;
        int totalWater = this.quantity;
        for(Map.Entry<WaterRange, Double> entry: waterRangeMap.entrySet()) {
            if(totalWater>= entry.getKey().getStart()) {
                totalRate += Math.abs(entry.getKey().getEnd()-totalWater) *  entry.getValue();
                totalWater = totalWater - entry.getKey().getEnd();
                if(totalWater<=0)
                    break;
            }
        }
        return totalRate;
    }
}