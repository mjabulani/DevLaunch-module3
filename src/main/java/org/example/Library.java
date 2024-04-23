package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Library {


    HashMap<Author, List<Book>> library = new HashMap<>();

    public Library() {

    }

    public List<Book> getBooksOfAuthor(String authorName) {
        return library.entrySet().stream()
                .filter(entry -> entry.getKey()
                        .getName().equals(authorName)).map(Map.Entry::getValue).flatMap(List::stream).collect(Collectors.toList());
    }

    public void addBookToAuthor(Book book, Author author) {
        List<Book> books = library.getOrDefault(author, new ArrayList<>());
        books.add(book);
        library.put(author, books);
    }

    public List<Author> getAllAuthors() {
        return new ArrayList<>(library.keySet());
    }

    public List<Book> getAllBooks() {
        return library.entrySet().stream().map(Map.Entry::getValue).flatMap(List::stream).collect(Collectors.toList());
    }

    public HashMap<Author, List<Book>> getAllBooksAndAuthors() {
        return library;
    }

    public void addAuthor(Author author) {
        library.put(author, new ArrayList<>());
    }

    @Override
    public String toString() {
        return "Library{" +
                "library=" + library +
                '}';
    }
}
