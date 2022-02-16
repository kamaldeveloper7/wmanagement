package com.watermanagement.client;

import com.watermanagement.exception.CommandNotFoundException;
import com.watermanagement.interaction.CommandFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;


public abstract class Client {
    private BufferedReader inputReader;
    private CommandFactory commandFactory;

    public Client(BufferedReader bufferedReader, CommandFactory commandFactory) {
        this.inputReader = bufferedReader;
        this.commandFactory = commandFactory;
    }

    public void handleInput() throws IOException {
        try {
            while (true) {
                String inputLine = this.inputReader.readLine();
                if(inputLine==null)
                    break;

                inputLine = inputLine.trim();
                if(inputLine.length()==0)
                    continue;

                if(inputLine.equalsIgnoreCase("exit"))
                    break;

                processInputLine(inputLine);
            }
        } finally {
            inputReader.close();
        }
    }

    private void processInputLine(String inputLine) {
        String[] inputChunks = inputLine.split(" ");
        String command = inputChunks[0];
        String[] params = Arrays.copyOfRange(inputChunks, 1, inputChunks.length);
        try {
            commandFactory.executeCommand(command, params);
        } catch (CommandNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
