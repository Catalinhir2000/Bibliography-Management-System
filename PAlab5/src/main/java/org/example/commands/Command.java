package org.example.commands;

import org.example.Catalog;

public abstract class Command {
    protected Catalog catalog;

    public Command(Catalog catalog) {
        this.catalog = catalog;
    }

    public abstract void run();
}
