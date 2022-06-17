package org.example;

import org.example.items.Item;


import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * un obiect de tip catalog contine un nume, o cale si o lista de obiecte de timpul Item
 */

public class Catalog {
    private String name;
    private String path;
    private List<Item> items = new ArrayList<>();

    public Catalog() {
        super();
    }

    public Catalog(String name, String path) {
        this.name = name;
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Catalog{" +
                "name='" + name + '\'' +
                ", path='" + path + '\'' +
                ", items=" + items +
                '}';
    }
    public void add(Item item){
        items.add(item);
    }



    public Item findById(String id) {
        for (Item item : items) {
            if (item.getUid().equals(id)) {
                return item;
            }
        }
        return null;
    }



}
