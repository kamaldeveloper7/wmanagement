package com.watermanagement.domain.bill;

import com.watermanagement.domain.apartment.Apartment;
import com.watermanagement.domain.person.Person;
import com.watermanagement.domain.person.PersonType;
import com.watermanagement.domain.water.WaterConfiguration;


public abstract class BillGeneration {

    public Bill calculateBill(Apartment apartment) {
        Bill bill = new NormalBill(apartment.getApartmentId());
        int member = 0;
        int guest = 0;
        for(Person person: apartment.getPersonList()) {
            if(person.getPersonType().equals(PersonType.FAMILY_MEMBER)) {
                member++;
            } else if(person.getPersonType().equals(PersonType.GUEST)) {
                guest++;
            }
        }
        bill.setNoOfMembers(member);
        bill.setNoOfGuests(guest);
        WaterConfiguration waterConfiguration = apartment.getWaterConfiguration();
        int borewellQty = waterConfiguration.getBorewellWater().getQuantity();
        int corporationQty = waterConfiguration.getCorporationWater().getQuantity();
        bill.setQty(borewellQty+corporationQty);
        int totalAmt = (int) (member*30*borewellQty*waterConfiguration.getBorewellWater().getRate() + member*30*corporationQty*waterConfiguration.getCorporationWater().getQuantity());
        bill.setAmount(totalAmt);
        bill.setWaterConfiguration(waterConfiguration);
        return bill;
    }

    public abstract void processBillInfo(Bill bill);
}
