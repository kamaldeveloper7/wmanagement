package com.watermanagement;

import com.watermanagement.client.Client;
import com.watermanagement.client.ClientFactory;
import com.watermanagement.handler.ManagementFacade;
import com.watermanagement.interaction.CommandFactory;

import java.io.FileNotFoundException;
import java.io.IOException;

public class WaterManagementApplication {

    public static void main(String[] args) {
        ManagementFacade managementFacade = new ManagementFacade();
        CommandFactory commandFactory = CommandFactory.init(managementFacade);

        try {
            Client client = ClientFactory.buildClient(args, commandFactory);
            client.handleInput();
        } catch (FileNotFoundException ex) {
            System.out.println("file is not valid");
        } catch (IOException ex) {
            System.out.println("error!");
        }
    }
}
