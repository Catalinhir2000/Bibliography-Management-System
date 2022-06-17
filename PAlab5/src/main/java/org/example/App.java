package org.example;

import org.example.commands.AddCommand;
import org.example.commands.Command;
import org.example.commands.ListCommand;
import org.example.exceptions.ConsoleCommand;
import org.example.exceptions.WrongCatalog;
import org.example.exceptions.WrongPath;
import org.example.exceptions.WrongYear;
import org.example.items.Article;
import org.example.items.Book;
import org.example.items.Item;

import java.io.IOException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws WrongPath, WrongYear, IOException, WrongCatalog, ConsoleCommand {
        App app = new App();
        app.testCreateSave();
        app.testLoadView();

        Catalog catalog =
                new Catalog("MyRefs", "D");
        var book = new Book("1", "abc", "D/", "ION" );
        var article = new Article("2", "Ascad", "D/sde", "cineva", 2021 );
        catalog.add(book);
        catalog.add(article);

        App.runConsole(catalog);


    }
    private void testCreateSave() throws WrongPath, WrongYear, IOException {
        Catalog catalog =
                new Catalog("MyRefs", "D");
        var book = new Book("1", "abc", "D/", "ION" );
        var article = new Article("2", "Ascad", "D/sde", "cineva", 2021 );
        catalog.add(book);
        catalog.add(article);

        CatalogUtil.save(catalog, "d:/cataloage/catalog.json");
    }
    private void testLoadView() throws WrongCatalog, IOException {
        Catalog catalog = CatalogUtil.load("d:/cataloage/catalog.json");
        CatalogUtil.view(catalog.findById("2"));
    }

    public static void runConsole(Catalog catalog) throws ConsoleCommand, WrongPath, WrongYear {
        boolean program = true;
        Scanner s = new Scanner(System.in);
        String input;

        while (program){
            input = s.next();
            switch (input){
                case "add":
                    System.out.println("please say the type of item");
                    String type = s.next();
                    System.out.println("please say the name of the item");
                    String name = s.next();
                    System.out.println("please say the path of the item");
                    String cale = s.next();
                    if ((type != null) && (name != null) && (cale != null)) {
                        if (type.equals("book")) {
                            Item inBook = null;
                            inBook = new Book("x", name, cale, "x");
                            if (inBook != null) {
                                Command add = new AddCommand(catalog, inBook);
                                add.run();
                            }
                        }

                        if (type.equals("article")) {
                            Item inArticle = null;
                            inArticle = new Article("x", name, cale, "x", 2022);
                            if (inArticle != null) {
                                Command add = new AddCommand(catalog, inArticle);
                                add.run();
                            }
                        }
                    }
                    else System.out.println("Wrong input");
                    break;

                case "list":
                    Command list = new ListCommand(catalog);
                    list.run();
                    break;


            }
        }
    }


}
