package org.example;

public class Book implements Comparable<Book> {

    private String title;
    private Genre genre;
    private int numberOfPages;

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public Book(String title, Genre genre, int numberOfPages) {
        this.title = title;
        this.genre = genre;
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", genre=" + genre +
                ", numberOfPages=" + numberOfPages +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        return Integer.compare(numberOfPages, o.getNumberOfPages());
    }
}
