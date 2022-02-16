package com.watermanagement.domain.apartment;

public class ApartmentBuilder extends PropertyBuilder {

    Apartment createApartment(String apartmentType) {
        BuildingConfigurationFactory buildingConfigurationFactory = new ApartmentConfiguration();
        if(apartmentType.equals("2")) {
            return new TwoBhkApartment(buildingConfigurationFactory);
        } else if(apartmentType.equals("3")) {
            return new ThreeBhkApartment(buildingConfigurationFactory);
        } else return null;
    }
}
