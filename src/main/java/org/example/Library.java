package org.example;


import java.util.ArrayList;
import java.util.List;

public class Library extends Object {

    public List<Book> books = new ArrayList<>();

    public void addBook(Book book) {

        if (books.size() >= 4) {
            System.out.println("Library is full");
            return;
        }
        books.add(book);
    }

    public void deleteBook(Book book) {
        if (!books.contains(book)) {
            System.out.println("Book not found");
            return;
        }
        books.remove(book);
    }

    public void listBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void deleteBookByName(String bookName) {
        for (Book book : books) {
            if (book.name.equalsIgnoreCase(bookName)) {
                System.out.println("Deleting book: ");
                books.remove(book);
                return;
            }
        }
        System.out.println("Book not found: " + bookName);
    }
}