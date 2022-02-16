package com.watermanagement.domain.bill;

public class LateBill extends Bill{
    private int surcharge;

    public LateBill(String id) {
        super(id);
    }
    // late bill can have extra or charges in bill to consider
}
