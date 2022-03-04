package com.flight.domain.airline;

import com.flight.domain.flight.Flight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public abstract class Airline implements IAirService {

    private String name;
    protected List<Flight> flightList;

    public Airline(String name) {
        this.name = name;
        this.flightList = new ArrayList<>();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public List<Flight> getAllFlights() {
        return this.flightList;
    }

    public abstract void addFlight(Flight flight);

    public abstract HashMap<String, List<String>> getFlightMap();
}
