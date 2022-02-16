package com.watermanagement.domain.bill;

import com.watermanagement.utils.GeneralUtils;
import com.watermanagement.domain.water.WaterConfiguration;

import java.util.Date;

public class Bill {
    private String id;
    private String apartmentId;
    private int noOfMembers;
    private int noOfGuests;
    private Date billDate;
    private BillUnit billUnit;
    private WaterConfiguration waterConfiguration;
    private int qty;
    private int amount;
    private BillStatus billStatus;

    public Bill(String apartmentId) {
        this.id = GeneralUtils.generateUniqueId();
        this.billDate = new Date();
        this.apartmentId = apartmentId;
    }

    public String getId() {
        return id;
    }

    public String getApartmentId() {
        return apartmentId;
    }

    public int getNoOfMembers() {
        return noOfMembers;
    }

    public int getNoOfGuests() {
        return noOfGuests;
    }

    public Date getBillDate() {
        return billDate;
    }

    public BillUnit getBillUnit() {
        return billUnit;
    }

    public int getAmount() {
        return amount;
    }

    public BillStatus getBillStatus() {
        return billStatus;
    }

    public void setNoOfMembers(int noOfMembers) {
        this.noOfMembers = noOfMembers;
    }

    public void setNoOfGuests(int noOfGuests) {
        this.noOfGuests = noOfGuests;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setBillStatus(BillStatus billStatus) {
        this.billStatus = billStatus;
    }

    public WaterConfiguration getWaterConfiguration() {
        return waterConfiguration;
    }

    public void setWaterConfiguration(WaterConfiguration waterConfiguration) {
        this.waterConfiguration = waterConfiguration;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
