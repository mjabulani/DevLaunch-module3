package org.example;

import java.util.*;

public class LibraryCollections {


    private HashMap<Author, List<Book>> library = new HashMap<>();

    public List<Book> getBooksOfAuthor(String authorName) {
        for (Author author : library.keySet()) {
            if (author.getName().equals(authorName)) {
                return library.get(author);
            }
        }
        return new ArrayList<>();
    }


    public boolean addBookToAuthor(String authorName, Book book) {
        for (Author author : library.keySet()) {
            if (author.getName().equals(authorName)) {
                library.get(author).add(book);
                Collections.sort(library.get(author));
                return true;
            }
        }
        return false;
    }

    public Set<Author> getAllAuthors() {
        return library.keySet();
    }

    public List<Book> getAllBooks() {
        List<Book> allBooks = new ArrayList<>();
        for (Author author : library.keySet()) {
            for (Book book : library.get(author)) {
                allBooks.add(book);
            }
        }
        return allBooks;
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
