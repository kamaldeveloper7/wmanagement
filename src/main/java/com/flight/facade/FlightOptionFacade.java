package com.flight.facade;

import com.flight.domain.airline.Airline;
import com.flight.domain.airline.CommercialAirline;
import com.flight.domain.airline.Airport;
import com.flight.domain.flight.Flight;
import com.flight.selectionStrategy.IFlightSelectionStrategy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class FlightOptionFacade {

    private Airline airline;
    private HashMap<String, Airport> airportsInfo;
    private HashMap<String, Flight> flightHashMap;

    public FlightOptionFacade() {
        this.airportsInfo = new HashMap<>();
        this.flightHashMap = new HashMap<>();
    }

    public List<FlightOption> getAllFlightOption(String fromAirportCode, String toAirportCode, IFlightSelectionStrategy flightSelectionStrategy){
        List<FlightOption> flightOptions = new ArrayList<>();
        flightSelectionStrategy.completeJourney(fromAirportCode, toAirportCode, this.airline.getFlightMap(), this.airportsInfo, this.flightHashMap);
        return flightOptions;
    }

    public void registerAirport(Airport airport) {
        this.airportsInfo.put(airport.getCode(), airport);
    }

    public HashMap<String, Airport> getAirportsInfo() {
        return this.airportsInfo;
    }

    public Airport getAirportsInfoByCode (String code) {
        return this.airportsInfo.get(code);
    }

    public void addFlightSchedule(Flight flight) {
        this.airline.addFlight(flight);
        this.flightHashMap.put(flight.getFlightCode(), flight);
    }

    public void registerAirline() {
        this.airline = new CommercialAirline("Indigo");
    }

    public HashMap<String, Flight> getFlightHashMap() {
        return this.flightHashMap;
    }

}
