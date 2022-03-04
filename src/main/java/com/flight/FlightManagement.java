package com.flight;

import com.flight.facade.FlightOptionFacade;
import com.flight.initialDataSetup.AirLineDataBuilder;
import com.flight.selectionStrategy.FlightSelectionStrategy;
import com.flight.selectionStrategy.IFlightSelectionStrategy;

import java.io.IOException;

public class FlightManagement {

    public static void main(String[] args) throws IOException {
        AirLineDataBuilder airLineDataBuilder = new AirLineDataBuilder();
        FlightOptionFacade flightOptionFacade = airLineDataBuilder.withInitialData().build();
        IFlightSelectionStrategy flightSelectionStrategy = new FlightSelectionStrategy();
        flightOptionFacade.getAllFlightOption("ATQ", "BLR", flightSelectionStrategy);
    }
}
