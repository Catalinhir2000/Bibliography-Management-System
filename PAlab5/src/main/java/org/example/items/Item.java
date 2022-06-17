package org.example.items;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.example.exceptions.WrongPath;

import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@JsonTypeInfo( use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = Book.class, name = "book"),
        @JsonSubTypes.Type(value = Article.class, name = "article")
})

/**
 * clasa Item este clasa abstracta de la ea se extind si celelalte tipuri de itemi (Article, Book), toate obiectele au un Unique ID, un nume, si o locatie
 */
public abstract class Item implements Serializable {
    private String uid;
    private String title;
    private String location;


    public Item() {

    }

    public Item(String  uid, String title, String location) throws WrongPath {
        this.uid = uid;
        this.title = title;

            this.location = location;

    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Item{" +
                "uid=" + uid +
                ", title='" + title + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
