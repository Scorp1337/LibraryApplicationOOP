package org.example;

public abstract class Book {
    public String name;
    public int numberOfPages;

    public Book(String name, int numberOfPages) {
        this.name = name;
        this.numberOfPages = numberOfPages;
    }
}
