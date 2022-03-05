package com.flight.domain.vehicle;

import com.flight.domain.trip.Flight;

import java.util.List;

public interface IAirService {

    List<Flight> getAllFlights();
}
