package com.flight.domain.terminal;

public class Address {
    private String countryCode;

    public Address(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryCode() {
        return countryCode;
    }
}
