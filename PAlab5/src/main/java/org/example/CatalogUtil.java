package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.exceptions.WrongCatalog;
import org.example.items.Item;

import java.io.File;
import java.io.IOException;

public class CatalogUtil {
    public static void save(Catalog catalog, String path) throws IOException{
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(
                new File(path),
                catalog);
    }
    public static Catalog load(String path)
            throws WrongCatalog, IOException{
        ObjectMapper objectMapper = new ObjectMapper();
        Catalog catalog = objectMapper.readValue(
                new File(path),
                Catalog.class);
        return catalog;
    }

    public static void view(Item item){
            System.out.println(item);
    }

}
