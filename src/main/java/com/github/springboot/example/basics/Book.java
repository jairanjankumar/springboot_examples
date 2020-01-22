package com.github.springboot.example.basics;

public class Book {
    long id;
    String author;
    String name;

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public Book(long id, String author, String name) {
        this.id = id;
        this.author = author;
        this.name = name;
    }
}
