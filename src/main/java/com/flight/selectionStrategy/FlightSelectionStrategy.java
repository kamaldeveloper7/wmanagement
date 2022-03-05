package com.flight.selectionStrategy;

import com.flight.domain.terminal.Airport;
import com.flight.domain.trip.Flight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class FlightSelectionStrategy implements IFlightSelectionStrategy {

    List<List<Flight>> flightsList;
    HashMap<String, List<String>> flightMap;
    HashMap<String, Airport> airportsInfo;
    HashMap<String, Flight> flightHashMap;

    public FlightSelectionStrategy(HashMap<String, List<String>> flightMap, HashMap<String, Airport> airportsInfo, HashMap<String, Flight> flightHashMap) {
        this.flightsList = new ArrayList<>();
        this.flightMap = flightMap;
        this.airportsInfo = airportsInfo;
        this.flightHashMap = flightHashMap;
    }

    @Override
    public List<List<Flight>> completeJourney(String fromAirPort, String toAirPort) {
        HashSet<String> visited = new HashSet<>();
        List<Flight> ls = new ArrayList<>();
        dfs(fromAirPort, toAirPort, visited, ls);

        return this.flightsList;
    }

    void dfs(String fromAirPort, String toAirport, HashSet<String> visited, List<Flight> ls) {
        if(visited.contains(fromAirPort))
            return;

        if(fromAirPort.equalsIgnoreCase(toAirport)) {
            this.flightsList.add(new ArrayList<>(ls));
            return;
        }
        visited.add(fromAirPort);
        ls.add(flightHashMap.get(fromAirPort));
        for(int i=0; i<flightMap.get(fromAirPort).size(); i++) {
            dfs(flightMap.get(fromAirPort).get(i), toAirport, visited, ls);
        }
        ls.remove(ls.size()-1);
    }
}
