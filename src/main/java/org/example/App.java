package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Library myLibrary = new Library();

        Book firstBook = new Novel("Baltagul", 250, "Crime");
        Book secondBook = new Novel("Harry Potter", 300, "SF");
        Book thirdBook = new ArtAlbum("DaVinci", 100, "Excelent");
        Book forthBook = new ArtAlbum("Abstract", 50, "Poor");
        Book fifthBook = new ArtAlbum("Abstract", 50, "Poor");

        myLibrary.addBook(firstBook);
        myLibrary.addBook(secondBook);
        myLibrary.addBook(thirdBook);
        myLibrary.addBook(forthBook);
        myLibrary.addBook(fifthBook);

        myLibrary.listBooks();
        System.out.println();
        myLibrary.deleteBook(secondBook);

        myLibrary.listBooks();
        System.out.println();
        myLibrary.deleteBookByName("Abstract");

        myLibrary.listBooks();

        myLibrary.deleteBookByName("Abstract");

    }
}
