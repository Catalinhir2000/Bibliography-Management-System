package org.example.exceptions;

public class ConsoleCommand extends Exception{
    public ConsoleCommand() {
        super("Invalid command");
    }
}
