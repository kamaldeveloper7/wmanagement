package com.watermanagement.client;

import com.watermanagement.interaction.CommandFactory;

import java.io.BufferedReader;

public class CLIClient extends Client {

    public CLIClient(BufferedReader bufferedReader, CommandFactory commandFactory) {
        super(bufferedReader, commandFactory);
    }
}
