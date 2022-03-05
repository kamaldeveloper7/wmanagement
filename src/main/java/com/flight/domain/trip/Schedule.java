package com.flight.domain.trip;

import com.flight.domain.measurement.Time;

public class Schedule implements ISchedule {
    private Time startTime;
    private Time endTime;

    public Schedule(Time startTime, Time endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public Time getStartTime() {
        return this.startTime;
    }

    @Override
    public Time getEndTime() {
        return this.endTime;
    }
}
