package com.watermanagement.domain.water;

public class WaterConfiguration {
    private BorewellWater borewellWater;
    private CorporationWater corporationWater;
    private TankWater tankWater;

    public WaterConfiguration(BorewellWater borewellWater, CorporationWater corporationWater) {
        this.borewellWater = borewellWater;
        this.corporationWater = corporationWater;
    }

    public void addTankerWater(TankWater tankWater) {
        this.tankWater = tankWater;
    }

    public BorewellWater getBorewellWater() {
        return borewellWater;
    }

    public CorporationWater getCorporationWater() {
        return corporationWater;
    }

    public TankWater getTankWater() {
        return tankWater;
    }
}
