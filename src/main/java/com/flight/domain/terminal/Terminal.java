package com.flight.domain.terminal;

import com.flight.domain.measurement.Time;

public abstract class Terminal implements ITerminal {
    private String code;
    private Address address;
    private Time stoppageTime;

    public Terminal(String code, Address address, Time stoppageTime) {
        this.code = code;
        this.address = address;
        this.stoppageTime = stoppageTime;
    }

    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public Address getAddress() {
        return this.address;
    }

    @Override
    public Time getStoppageTime() {
        return this.stoppageTime;
    }
}
