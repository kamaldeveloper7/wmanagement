package com.flight.domain.vehicle;

import com.flight.domain.trip.Flight;

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
    public void addFlight(Flight trip) {
        this.flightList.add(trip);
        buildTripMap(trip);
    }

    void buildTripMap(Flight trip) {
        if(!this.flightMap.containsKey(trip.getFromTerminal().getCode())) {
            this.flightMap.put(trip.getFromTerminal().getCode(), new ArrayList<>());
        }
        this.flightMap.get(trip.getFromTerminal().getCode()).add(trip.getToTerminal().getCode());
    }

    public HashMap<String, List<String>> getFlightMap() {
        return this.flightMap;
    }
}
