package org.example.commands;

import org.example.Catalog;
import org.example.items.Item;

import java.util.ArrayList;
import java.util.List;

public class ListCommand extends Command{
    public ListCommand(Catalog catalog) {
        super(catalog);
    }

    @Override
    public void run() {
        List<Item> lista = new ArrayList<>(super.catalog.getItems());
        for(Item item : lista)
            System.out.println(item);
    }
}
