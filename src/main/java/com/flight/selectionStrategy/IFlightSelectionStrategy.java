package com.flight.selectionStrategy;

import com.flight.domain.trip.Flight;

import java.util.List;

public interface IFlightSelectionStrategy {

    List<List<Flight>> completeJourney(String fromAirPort, String toAirPort);
}
