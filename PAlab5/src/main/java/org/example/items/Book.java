package org.example.items;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.example.exceptions.WrongPath;
import org.example.items.Item;

@JsonTypeInfo( use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = Book.class, name = "book")
})

public class Book extends Item {
    private String author;


    public Book() {
        super();
    }

    public Book(String uid, String title, String location, String author) throws WrongPath {
        super(uid, title, location);
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                '}';
    }
}
