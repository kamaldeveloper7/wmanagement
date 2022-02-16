package com.watermanagement.handler;

import com.watermanagement.domain.apartment.Apartment;
import com.watermanagement.domain.apartment.ApartmentBuilder;
import com.watermanagement.domain.apartment.PropertyBuilder;
import com.watermanagement.domain.bill.Bill;
import com.watermanagement.domain.bill.BillGeneration;
import com.watermanagement.domain.bill.ConsoleBillGeneration;

public class ManagementFacade {

    private Apartment apartment;

    public void allotWater(String apartmentType, String proportion) {
        String[] proportionCount = proportion.split(":");
        PropertyBuilder apartmentBuilder = new ApartmentBuilder();
        apartment = apartmentBuilder.prepareApartment(apartmentType, Integer.parseInt(proportionCount[0]), Integer.parseInt(proportionCount[1]));
    }

    public void addGuests(int guestCount){
        apartment.addGuests(guestCount);
    }

    public void displayBill() {
        BillGeneration billGeneration = new ConsoleBillGeneration();
        Bill bill = billGeneration.calculateBill(apartment);
        billGeneration.processBillInfo(bill);
    }
}
