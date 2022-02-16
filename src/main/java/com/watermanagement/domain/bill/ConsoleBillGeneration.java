package com.watermanagement.domain.bill;


public class ConsoleBillGeneration extends BillGeneration {

    public void processBillInfo(Bill bill) {
        System.out.println(bill.getQty() + " " + bill.getAmount());
    }
}
