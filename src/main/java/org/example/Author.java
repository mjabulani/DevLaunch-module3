package org.example;

import java.util.Objects;

public class Author {

    private String name;
    private int age;
    private Genre favouriteGenre;

    public Author(String name, int age, Genre favouriteGenre) {
        this.name = name;
        this.age = age;
        this.favouriteGenre = favouriteGenre;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Genre getFavouriteGenre() {
        return favouriteGenre;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return age == author.age && Objects.equals(name, author.name) && favouriteGenre == author.favouriteGenre;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, favouriteGenre);
    }
}
