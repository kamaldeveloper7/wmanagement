package com.flight.domain.flight;

import com.flight.domain.airline.Airport;

public interface IFlight {

    String getFlightCode();

    Airport getFromAirport();

    Airport getToAirPort();

    Schedule getSchedule();
}
