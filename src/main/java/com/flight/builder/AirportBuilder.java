package com.flight.builder;

import com.flight.domain.airline.Airport;

public class AirportBuilder {
    private String countryCode;
    private String airportCode;

    public static AirportBuilder withDefault() {
        return new AirportBuilder().withCountryCode(null).withAirportCode(null);
    }

    public AirportBuilder withCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    public AirportBuilder withAirportCode(String airportCode) {
        this.airportCode = airportCode;
        return this;
    }

    public Airport build() {
        return new Airport(this.airportCode, this.countryCode);
    }
}
