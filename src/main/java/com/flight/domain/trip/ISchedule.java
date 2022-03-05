package com.flight.domain.trip;

import com.flight.domain.measurement.Time;

public interface ISchedule {

    Time getStartTime();

    Time getEndTime();
}
