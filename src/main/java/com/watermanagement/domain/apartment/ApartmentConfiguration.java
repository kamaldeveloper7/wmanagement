package com.watermanagement.domain.apartment;

import com.watermanagement.domain.person.Guest;
import com.watermanagement.domain.person.Member;
import com.watermanagement.domain.person.Person;
import com.watermanagement.domain.water.BorewellWater;
import com.watermanagement.domain.water.CorporationWater;
import com.watermanagement.domain.water.TankWater;
import com.watermanagement.domain.water.WaterConfiguration;

import java.util.ArrayList;
import java.util.List;

public class ApartmentConfiguration implements BuildingConfigurationFactory {

    public List<Person> createMembers(int personCount) {
        List<Person> people = new ArrayList<Person>();
        for(int i=0; i<personCount; i++) {
            people.add(new Member());
        }
        return people;
    }

    public List<Person> createGuests(int personCount) {
        List<Person> people = new ArrayList<Person>();
        for(int i=0; i<personCount; i++) {
            people.add(new Guest());
        }
        return people;
    }

    public BorewellWater provideBoreWellWater(int qty) {
        return new BorewellWater(1.5, qty);
    }

    public CorporationWater provideCorporationWater(int qty) {
        return new CorporationWater(1, qty);
    }

    public TankWater provideTankerWater(int qty) {
        return null;
    }

    public WaterConfiguration provideCombineWaterConfiguration(BorewellWater borewellWater, CorporationWater corporationWater) {
        return new WaterConfiguration(borewellWater, corporationWater);
    }
}
