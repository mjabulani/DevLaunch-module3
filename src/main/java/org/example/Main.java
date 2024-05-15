package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

//        WordCount wordCount = new WordCount();
//        String text = "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, " +
//                "totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. " +
//                "Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos " +
//                "qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, " +
//                "adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem. " +
//                "Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi " +
//                "consequatur? Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, " +
//                "vel illum qui dolorem eum fugiat quo voluptas nulla pariatur?";
//
//        Map<String, Integer> map;
//        map = wordCount.wordCount(text);
//        map.entrySet()
//                .stream()
//                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
//                .forEach(e -> System.out.println("Word: " + e.getKey() + " | count: " + e.getValue()));
//
//
//        Student s1 = new Student(34, 1.83, "Marek", "Jabulani");
//        Student s2 = new Student(11, 1.85, "Mati", "Wiewior");
//        Student s3 = new Student(42, 1.68, "Anna", "Mazur");
//        Student s4 = new Student(29, 1.74, "Wojtek", "Rabinski");
//        Student s5 = new Student(24, 1.74, "Wojtek", "Czaban");
//
//
//        List<Student> students = new ArrayList<>();
//        students.add(s1);
//        students.add(s2);
//        students.add(s3);
//        students.add(s4);
//        students.add(s5);
//
//        // before sorting
//        for (Student student : students) {
//            System.out.println(student);
//        }
//
//        // after sorting by overridden comparator by name and age
//
//        System.out.println("Sorting by name and age");
//        Collections.sort(students);
//
//        for (Student student : students) {
//            System.out.println(student);
//        }
//
//        StudentNameComparator studentNameComparator = new StudentNameComparator();
//
//        Collections.sort(students, studentNameComparator);
//        System.out.println("Sorting by name reversed");
//
//        for (Student student : students) {
//            System.out.println(student);
//        }

        //
        Author author1 = new Author("Franz Kafka", 30, Genre.POSTAPO);
        Author author2 = new Author("JRR Tolkien", 50, Genre.FANTASY);
        Author author3 = new Author("Terry Hayes", 40, Genre.CRIMINAL);
        List<Author> authors = new ArrayList<>();

        authors.add(author1);
        authors.add(author2);
        authors.add(author3);

        Book book1 = new Book("Kruk", Genre.FANTASY, 432);
        Book book2 = new Book("Konopielka", Genre.FANTASY, 213);
        Book book3 = new Book("SMOOTH BLOOD", Genre.SCIFI, 533);
        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);

        LibraryCollections lib = new LibraryCollections();

        System.out.println("books of kruk");
        System.out.println(lib.getBooksOfAuthor("Franz Kafka"));


        Library library = new Library();


        lib.addAuthor(author1);
        lib.addBookToAuthor(author1.getName(), book1);
        lib.addBookToAuthor(author1.getName(), book2);
        System.out.println(lib);


    }

}