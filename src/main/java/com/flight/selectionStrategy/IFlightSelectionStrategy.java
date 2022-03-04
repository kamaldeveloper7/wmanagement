package com.flight.selectionStrategy;

import com.flight.domain.airline.Airport;
import com.flight.domain.flight.Flight;

import java.util.HashMap;
import java.util.List;

public interface IFlightSelectionStrategy {

    List<List<Flight>> completeJourney(String fromAirPort, String toAirPort, HashMap<String, List<String>> flightMap, HashMap<String, Airport> airportsInfo, HashMap<String, Flight> flightHashMap);
}
