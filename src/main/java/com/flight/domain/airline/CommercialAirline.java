package com.flight.domain.airline;

import com.flight.domain.airline.Airline;
import com.flight.domain.flight.Flight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CommercialAirline extends Airline {

    private HashMap<String, List<String>> flightMap;

    public CommercialAirline(String name) {
        super(name);
        this.flightMap = new HashMap<>();
    }

    @Override
    public void addFlight(Flight flight) {
        this.flightList.add(flight);
        buildFlightMap(flight);
    }

    void buildFlightMap(Flight flight) {
        if(!this.flightMap.containsKey(flight.getFromAirport().getCode())) {
            this.flightMap.put(flight.getFromAirport().getCode(), new ArrayList<>());
        }
        this.flightMap.get(flight.getFromAirport().getCode()).add(flight.getToAirPort().getCode());
    }

    public HashMap<String, List<String>> getFlightMap() {
        return this.flightMap;
    }
}
