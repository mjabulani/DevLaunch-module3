import org.example.Author;
import org.example.Book;
import org.example.Genre;
import org.example.LibraryCollections;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

public class LibraryCollectionsTest {

    LibraryCollections libraryCollections = new LibraryCollections();

    // Tests for getBooksOfAuthor()

    @Test
    void bookOfAuthor() {
        Book book = new Book("ASD", Genre.POSTAPO, 123);
        Author author = new Author("Alfred", 33, Genre.POSTAPO);
        libraryCollections.addAuthor(author);
        libraryCollections.addBookToAuthor(book);
        Assertions.assertTrue(libraryCollections.getBooksOfAuthor(author.getName()), book);
    }

        // Tests for getAllBooks()

        // Tests for getAllBooksAndAuthors()

        // Tests for addAuthor()
    }

