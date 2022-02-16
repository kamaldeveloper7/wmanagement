package com.watermanagement.domain.apartment;

import com.watermanagement.domain.person.Person;
import com.watermanagement.utils.GeneralUtils;

import java.util.ArrayList;


public class ThreeBhkApartment extends Apartment {
    BuildingConfigurationFactory buildingConfigurationFactory;

    public ThreeBhkApartment(BuildingConfigurationFactory buildingConfigurationFactory) {
        this.buildingConfigurationFactory = buildingConfigurationFactory;
        this.apartmentId = GeneralUtils.generateUniqueId();
        this.personList = new ArrayList<Person>();
    }

    void prepare(int personQty, int boreWellQty, int corporationQty) {
        this.personList = buildingConfigurationFactory.createMembers(personQty);
        this.waterConfiguration =
                buildingConfigurationFactory.provideCombineWaterConfiguration(buildingConfigurationFactory.provideBoreWellWater(boreWellQty),
                        buildingConfigurationFactory.provideCorporationWater(corporationQty));
    }

    public void addGuests(int personCount) {
        this.personList.addAll(buildingConfigurationFactory.createGuests(personCount));
    }

}
