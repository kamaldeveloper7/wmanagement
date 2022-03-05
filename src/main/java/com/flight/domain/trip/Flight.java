package com.flight.domain.trip;

import com.flight.domain.terminal.Terminal;

public class Flight extends FlightTrip {

    public Flight(String tripNo, Terminal fromTerminal, Terminal toTerminal, Schedule schedule) {
        super(tripNo, fromTerminal, toTerminal, schedule);
    }
}
