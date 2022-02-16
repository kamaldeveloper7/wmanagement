package com.watermanagement.client;

import com.watermanagement.interaction.CommandFactory;

import java.io.BufferedReader;

public class FileClient extends Client {
    public FileClient(BufferedReader bufferedReader, CommandFactory commandFactory) {
        super(bufferedReader, commandFactory);
    }
}
