package com.flight.domain.trip;

import com.flight.domain.terminal.Terminal;

public interface ITrip {

    String getTripCode();

    Terminal getFromTerminal();

    Terminal getToTerminal();

    Schedule getSchedule();
}
