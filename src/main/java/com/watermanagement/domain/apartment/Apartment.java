package com.watermanagement.domain.apartment;

import com.watermanagement.domain.person.Person;
import com.watermanagement.domain.water.WaterConfiguration;

import java.util.List;

public abstract class Apartment {
    protected String apartmentId;
    protected List<Person> personList;
    protected WaterConfiguration waterConfiguration;

    public String getApartmentId() {
        return apartmentId;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public WaterConfiguration getWaterConfiguration() {
        return waterConfiguration;
    }

    abstract void prepare(int personCount, int boreWellQty, int corporationQty);

    public abstract void addGuests(int personCount);
}
