package com.watermanagement.domain.apartment;

import com.watermanagement.domain.person.Person;
import com.watermanagement.domain.water.BorewellWater;
import com.watermanagement.domain.water.CorporationWater;
import com.watermanagement.domain.water.TankWater;
import com.watermanagement.domain.water.WaterConfiguration;

import java.util.List;

public interface BuildingConfigurationFactory {

    List<Person> createMembers(int personCount);

    List<Person> createGuests(int personCount);

    BorewellWater provideBoreWellWater(int qty);

    CorporationWater provideCorporationWater(int qty);

    TankWater provideTankerWater(int qty);

    WaterConfiguration provideCombineWaterConfiguration(BorewellWater borewellWater, CorporationWater corporationWater);
}
