package com.flight.domain.vehicle;

import com.flight.domain.trip.Flight;

import java.util.HashMap;
import java.util.List;

public class CharterAirline extends Airline {

    public CharterAirline(String name) {
        super(name);
    }

    @Override
    public void addFlight(Flight flight) {
        // add flight logic of charterAirline
    }

    @Override
    public HashMap<String, List<String>> getFlightMap() {
        return null;
    }
}
