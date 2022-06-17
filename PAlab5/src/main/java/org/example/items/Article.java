package org.example.items;

import org.example.exceptions.WrongPath;
import org.example.exceptions.WrongYear;
import org.example.items.Item;

public class Article extends Item {
    private String author;
    private int releaseYear;

    public Article(){
        super();
    }

    public Article(String uid, String title, String location, String author, int releaseYear) throws WrongPath, WrongYear {
        super(uid, title, location);
        this.author = author;
        if(releaseYear < 0)
            throw new WrongYear();
        else
            this.releaseYear =releaseYear;
    }

    @Override
    public String toString() {
        return "Article{" +
                "author='" + author + '\'' +
                ", releaseYear=" + releaseYear +
                '}';
    }
}
