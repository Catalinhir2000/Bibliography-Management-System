package org.example.commands;

import org.example.Catalog;
import org.example.items.Item;

import java.util.ArrayList;
import java.util.List;

public class AddCommand extends Command{
    private Item item;

    public AddCommand(Catalog catalog, Item item) {
        super(catalog);
        this.item = item;
    }

    @Override
    public void run() {
        List<Item> lista = new ArrayList<>(this.catalog.getItems());
        lista.add(this.item);
        this.catalog.setItems(lista);

    }
}
