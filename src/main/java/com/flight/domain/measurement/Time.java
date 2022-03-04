package com.flight.domain.measurement;

public class Time implements IMeasurement<TimeFormat>, Comparable<Time> {
    private String value;
    private TimeFormat timeFormat;

    public Time(String value, TimeFormat timeFormat) {
        this.value = value;
        this.timeFormat = timeFormat;
    }
    @Override
    public int getValue() {
        return 0;
        //return Integer.parseInt(this.hour+this.min);
    }

    @Override
    public TimeFormat getFormat() {
        return this.timeFormat;
    }

    @Override
    public int compareTo(Time o) {
        return 0;
        //return this.hour.equals(o.hour) ? Integer.parseInt(this.min)-Integer.parseInt(o.min): Integer.parseInt(this.hour)-Integer.parseInt(o.hour);
    }
}
