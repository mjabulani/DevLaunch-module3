import org.example.Author;
import org.example.Book;
import org.example.Genre;
import org.example.LibraryCollections;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LibraryCollectionsTest {

    private LibraryCollections libraryCollections = new LibraryCollections();

    private Author a1 = new Author("Tomek", 33, Genre.SCIFI);
    private Author a2 = new Author(null, 33, Genre.SCIFI);
    private Book b1 = new Book("W pustyni", Genre.SCIFI, 444);
    private Book bNoPages = new Book("W pustyni", Genre.SCIFI, 0);


    private List<Book> listOfBooks = new ArrayList<>();
    List<Book> emptyListOfBooks = new ArrayList<>();
    List<Author> emptyAuthorList = new ArrayList<>();


    // test getBooksOfAuthor()

    @Test
    void getBooksOfAuthorIfBooksPresent() {
        listOfBooks.add(b1);
        libraryCollections.addAuthor(a1);
        libraryCollections.addBookToAuthor(a1.getName(), b1);

        Assertions.assertEquals(listOfBooks, libraryCollections.getBooksOfAuthor("Tomek"));
    }

    @Test
    void getBooksOfAuthorIfBooksNotPresent() {
        libraryCollections.addAuthor(a1);
        Assertions.assertEquals(emptyListOfBooks, libraryCollections.getBooksOfAuthor("Tomek"));

    }

    @Test
    void getBooksOfAuthorIfAuthorNotPresent() {
        Assertions.assertEquals(emptyListOfBooks, libraryCollections.getBooksOfAuthor("Jurek"));

    }

    @Test
    void getBooksOfAuthorIfAuthorIsNull() {
        Assertions.assertEquals(emptyListOfBooks, libraryCollections.getBooksOfAuthor(null));
    }

    @Test
    void getBooksOfAuthorIfBookHasZeroPages() {
        Author a3 = new Author("Kazik", 39, Genre.POSTAPO);
        libraryCollections.addAuthor(a3);
        libraryCollections.addBookToAuthor("Kazik", bNoPages);
        List<Book> books = new ArrayList<>();
        books.add(bNoPages);
        Assertions.assertEquals(libraryCollections.getBooksOfAuthor("Kazik"), books);
    }

    // tests of addBookToAuthor()

    @Test
    void addBookToAuthorWhoIsNotPresent() {
        libraryCollections.addBookToAuthor("Janek", b1);
        Assertions.assertEquals(emptyListOfBooks, libraryCollections.getBooksOfAuthor("Janek"));
    }

    @Test
    void getAllAuthorsWhenNoAuthors() {
        Assertions.assertEquals(emptyAuthorList, new ArrayList<Author>());
    }

    // get all books

    @Test
    void getAllBooksWhenNoBooks() {
        Assertions.assertEquals(emptyListOfBooks, new ArrayList<Book>());
    }

}


