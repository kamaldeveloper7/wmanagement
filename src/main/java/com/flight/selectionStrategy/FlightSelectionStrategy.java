package com.flight.selectionStrategy;

import com.flight.domain.airline.Airport;
import com.flight.domain.flight.Flight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class FlightSelectionStrategy implements IFlightSelectionStrategy {

    List<List<Flight>> flightsList;

    public FlightSelectionStrategy() {
        this.flightsList = new ArrayList<>();
    }

    @Override
    public List<List<Flight>> completeJourney(String fromAirPort, String toAirPort, HashMap<String, List<String>> flightMap, HashMap<String, Airport> airportsInfo, HashMap<String, Flight> flightHashMap) {
        HashSet<String> visited = new HashSet<>();
        List<Flight> ls = new ArrayList<>();
        dfs(fromAirPort, toAirPort, flightMap, visited, ls, airportsInfo, flightHashMap);

        return this.flightsList;
    }

    void dfs(String fromAirPort, String toAirport, HashMap<String, List<String>> flightMap, HashSet<String> visited , List<Flight> ls, HashMap<String, Airport> airportsInfo, HashMap<String, Flight> flightHashMap) {
        if(visited.contains(fromAirPort))
            return;

        if(fromAirPort.equalsIgnoreCase(toAirport)) {
            this.flightsList.add(new ArrayList<>(ls));
            return;
        }
        visited.add(fromAirPort);
        ls.add(flightHashMap.get(fromAirPort));
        for(int i=0; i<flightMap.get(fromAirPort).size(); i++) {
            dfs(flightMap.get(fromAirPort).get(i), toAirport, flightMap, visited, ls, airportsInfo, flightHashMap);
        }
        ls.remove(ls.size()-1);
    }
}
