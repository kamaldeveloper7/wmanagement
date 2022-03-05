package com.flight.domain.terminal;

import com.flight.domain.measurement.Time;

public class Airport extends Terminal implements IAirport {

    public Airport(String code, String countryCode, Time stoppageTime) {
        super(code, new Address(countryCode), stoppageTime);
    }

    @Override
    public String getCountryCode() {
        return this.getAddress().getCountryCode();
    }
}
