package com.flight.domain.flight;

import com.flight.domain.airline.Airport;

public class Flight implements IFlight {

    private String flightNo;
    private Airport fromAirport;
    private Airport toAirPort;
    private Schedule schedule;

    public Flight(String flightNo, Airport fromAirport, Airport toAirPort, Schedule schedule) {
        this.flightNo = flightNo;
        this.fromAirport = fromAirport;
        this.toAirPort = toAirPort;
        this.schedule = schedule;
    }

    @Override
    public String getFlightCode() {
        return this.flightNo;
    }

    @Override
    public Airport getFromAirport() {
        return this.fromAirport;
    }

    @Override
    public Airport getToAirPort() {
        return this.toAirPort;
    }

    @Override
    public Schedule getSchedule() {
        return this.schedule;
    }
}
