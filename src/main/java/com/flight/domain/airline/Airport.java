package com.flight.domain.airline;

public class Airport implements IAirport {
    private String code;
    private String countryCode;

    public Airport(String code, String countryCode) {
        this.code = code;
        this.countryCode = countryCode;
    }

    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public String getCountryCode() {
        return this.countryCode;
    }
}
