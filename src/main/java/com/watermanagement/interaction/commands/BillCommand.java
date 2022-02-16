package com.watermanagement.interaction.commands;

import com.watermanagement.handler.ManagementFacade;

public class BillCommand implements Command{

    private ManagementFacade managementFacade;

    public BillCommand(ManagementFacade managementFacade) {
        this.managementFacade = managementFacade;
    }

    public void execute(String[] params) {
        managementFacade.displayBill();
    }
}
