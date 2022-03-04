package com.flight.builder;

import com.flight.domain.airline.Airport;
import com.flight.domain.flight.Flight;
import com.flight.domain.flight.Schedule;

public class FlightBuilder {
    private String flightNo;
    private Airport fromAirport;
    private Airport toAirPort;
    private Schedule schedule;

    public static FlightBuilder withDefault() {
        return new FlightBuilder().withFlightNo(null).flightFromAirport(null).flightToAirport(null).withSchedule(null);
    }

    public FlightBuilder withFlightNo(String flightNo) {
        this.flightNo = flightNo;
        return this;
    }

    public FlightBuilder flightFromAirport(Airport airport) {
        this.fromAirport = airport;
        return this;
    }

    public FlightBuilder flightToAirport(Airport airport) {
        this.toAirPort = airport;
        return this;
    }

    public FlightBuilder withSchedule(Schedule schedule) {
        this.schedule = schedule;
        return this;
    }

    public Flight build() {
        return new Flight(this.flightNo, this.fromAirport, this.toAirPort, this.schedule);
    }
}
