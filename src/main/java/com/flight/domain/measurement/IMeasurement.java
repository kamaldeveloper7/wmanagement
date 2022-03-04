package com.flight.domain.measurement;

public interface IMeasurement<T> {

    int getValue();

    T getFormat();
}
