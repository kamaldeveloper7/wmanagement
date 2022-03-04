package com.flight.domain.airline;

import com.flight.domain.flight.Flight;

import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;

public interface IAirService {

    String getName();

    List<Flight> getAllFlights();

//    HashMap<String, TreeSet<Flight>> getArrivalsMap();
//
//    HashMap<String, TreeSet<Flight>> getDeparturesMap();
}
