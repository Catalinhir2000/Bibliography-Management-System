package org.example.exceptions;

public class WrongCatalog extends Exception{
    public WrongCatalog(Exception ex) {
        super("Invalid catalog file.", ex);
    }
}
