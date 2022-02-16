package com.watermanagement.domain.apartment;

public abstract class PropertyBuilder {

    public Apartment prepareApartment(String apartmentType, int boreWellQty, int corporationQty) {
        Apartment apartment = createApartment(apartmentType);
        apartment.prepare(getPersonCount(apartmentType), boreWellQty, corporationQty);
        return apartment;
    }

    abstract Apartment createApartment(String apartmentType);

    private int getPersonCount(String apartmentType) {
        int personCount = 0;
        switch (apartmentType.charAt(0)) {
            case '2':
                personCount=3;
                break;
            case '3':
                personCount=5;
            default:
                break;
        }
        return personCount;
    }
}
