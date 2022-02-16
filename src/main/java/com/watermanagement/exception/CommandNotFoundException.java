package com.watermanagement.exception;

public class CommandNotFoundException extends RuntimeException {

    public CommandNotFoundException(String args) {
        super(args);
    }

    public String toString() {
        return String.format("ERR: %s", this.getMessage());
    }
}
