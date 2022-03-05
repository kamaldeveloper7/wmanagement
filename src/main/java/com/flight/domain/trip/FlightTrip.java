package com.flight.domain.trip;

import com.flight.domain.terminal.Terminal;

public abstract class FlightTrip implements ITrip {
    private String tripNo;
    private Terminal fromTerminal;
    private Terminal toTerminal;
    private Schedule schedule;

    public FlightTrip(String tripNo, Terminal fromTerminal, Terminal toTerminal, Schedule schedule) {
        this.tripNo = tripNo;
        this.fromTerminal = fromTerminal;
        this.toTerminal = toTerminal;
        this.schedule = schedule;
    }

    @Override
    public String getTripCode() {
        return this.tripNo;
    }

    @Override
    public Terminal getFromTerminal() {
        return this.fromTerminal;
    }

    @Override
    public Terminal getToTerminal() {
        return this.toTerminal;
    }

    @Override
    public Schedule getSchedule() {
        return this.schedule;
    }
}
