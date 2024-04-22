package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Library {


    HashMap<Author, List<Book>> library = new HashMap<>();

    public Library(Author author, List<Book> books) {
        this.library.put(author, books);
    }

    public HashSet<Book> getBooksOfAuthor(Author author) {
        return new HashSet<>(library.get(author));

    }

    public void addBookToAuthor(Book book, Author author) {
    }

    public HashSet<Author> getAllAuthors() {
        return null;
    }

    public HashSet<Book> getAllBooks() {
        return null;
    }

    public HashMap<Author, Book> getAllBooksAndAuthors() {
        return null;
    }

    public void addAuthor(Author author) {

    }

    @Override
    public String toString() {
        return "Library{" +
                "library=" + library +
                '}';
    }
}
