package com.watermanagement.interaction;

import com.watermanagement.handler.ManagementFacade;
import com.watermanagement.exception.CommandNotFoundException;
import com.watermanagement.interaction.commands.AddGuestsCommand;
import com.watermanagement.interaction.commands.AllowWaterCommand;
import com.watermanagement.interaction.commands.BillCommand;
import com.watermanagement.interaction.commands.Command;

import java.util.HashMap;
import java.util.Map;

public class CommandFactory {
    Map<String, Command> commandMap;

    private CommandFactory() {
        this.commandMap = new HashMap<String, Command>();
    }

    public static CommandFactory init(ManagementFacade managementFacade) {
        final CommandFactory cf = new CommandFactory();
        cf.addCommand("ALLOT_WATER", new AllowWaterCommand(managementFacade));
        cf.addCommand("ADD_GUESTS", new AddGuestsCommand(managementFacade));
        cf.addCommand("BILL", new BillCommand(managementFacade));
        return cf;
    }

    public void addCommand(String name, Command command) {
        commandMap.put(name, command);
    }

    public void executeCommand(String name, String[] params) {
        if(!commandMap.containsKey(name)) {
            throw new CommandNotFoundException("invalid command");
        }
        commandMap.get(name).execute(params);
    }

    public Map<String, Command> getCommands() {
        return commandMap;
    }
}
