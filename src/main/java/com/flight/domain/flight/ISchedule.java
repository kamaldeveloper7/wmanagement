package com.flight.domain.flight;

import com.flight.domain.measurement.Time;

public interface ISchedule {

    Time getStartTime();

    Time getEndTime();
}
