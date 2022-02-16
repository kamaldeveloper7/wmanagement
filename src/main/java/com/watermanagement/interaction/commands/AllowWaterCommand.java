package com.watermanagement.interaction.commands;

import com.watermanagement.handler.ManagementFacade;

import java.security.InvalidParameterException;

public class AllowWaterCommand implements Command {

    private ManagementFacade managementFacade;

    public AllowWaterCommand(ManagementFacade managementFacade) {
        this.managementFacade = managementFacade;
    }

    public void execute(String[] params) {
        if(params.length<2) {
            throw new InvalidParameterException("Exception less parameter!");
        }
        managementFacade.allotWater(params[0], params[1]);
    }
}
