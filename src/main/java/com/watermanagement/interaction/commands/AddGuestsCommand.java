package com.watermanagement.interaction.commands;

import com.watermanagement.handler.ManagementFacade;

import java.security.InvalidParameterException;

public class AddGuestsCommand implements Command {

    private ManagementFacade managementFacade;

    public AddGuestsCommand(ManagementFacade managementFacade) {
        this.managementFacade = managementFacade;
    }

    public void execute(String[] params) {
        if(params.length<1) {
            throw new InvalidParameterException("Exception less parameter!");
        }
        managementFacade.addGuests(Integer.parseInt(params[0]));
    }
}
