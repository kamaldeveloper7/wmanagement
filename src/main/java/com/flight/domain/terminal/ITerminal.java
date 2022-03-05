package com.flight.domain.terminal;

import com.flight.domain.measurement.Time;

public interface ITerminal {

    String getCode();

    Address getAddress();

    Time getStoppageTime();
}
