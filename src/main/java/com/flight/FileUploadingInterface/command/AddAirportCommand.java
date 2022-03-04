package com.flight.FileUploadingInterface.command;

import com.flight.facade.FlightOptionFacade;

public class AddAirportCommand implements Command {

    private FlightOptionFacade flightOptionFacade;

    AddAirportCommand(FlightOptionFacade flightOptionFacade) {
        this.flightOptionFacade = flightOptionFacade;
    }

    @Override
    public void execute(String[] params) {

    }
}
