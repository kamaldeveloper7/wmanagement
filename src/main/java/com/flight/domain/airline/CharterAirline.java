package com.flight.domain.airline;

import com.flight.domain.airline.Airline;
import com.flight.domain.flight.Flight;

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
