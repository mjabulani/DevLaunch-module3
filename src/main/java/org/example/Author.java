package org.example;

public class Author implements Comparable<Author> {

    private String name;
    private int age;
    private Genre favouriteGenre;

    public Author(String name, int age, Genre favouriteGenre) {
        this.name = name;
        this.age = age;
        this.favouriteGenre = favouriteGenre;
    }



    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", favouriteGenre=" + favouriteGenre +
                '}';
    }

    @Override
    public int compareTo(Author o) {
        return o.name.compareTo(this.name);
    }
}
