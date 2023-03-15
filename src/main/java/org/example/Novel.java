package org.example;

public class Novel extends Book{
    public String type;

    public Novel(String name, int numberOfPages, String type) {
        super(name, numberOfPages);
        this.type = type;
    }

    @Override
    public String toString() {
        return "Novel[" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +

                ", numberOfPages=" + numberOfPages +
                ']';
    }
}
