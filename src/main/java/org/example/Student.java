package org.example;


public class Student implements Comparable<Student> {

    private int age;
    private double height;
    private String name;
    private String lastName;

    public Student(int age, double height, String name, String lastName) {
        this.age = age;
        this.height = height;
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public int compareTo(Student o) {
        if (name.compareTo(o.getName()) != 0) {
            return name.compareTo(o.getName());
        }
        return Integer.compare(this.age, o.age);
    }

    public int getAge() { return age; }

    public double getHeight() { return height; }

    public String getName() { return name; }

    public String getLastName() { return lastName;}

    public void setAge(int age) { this.age = age; }

    public void setHeight(double height) { this.height = height; }

    public void setName(String name) { this.name = name; }

    public void setLastName(String lastName) { this.lastName = lastName; }


    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", height=" + height +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
