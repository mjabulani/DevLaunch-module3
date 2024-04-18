package org.example;

import javax.swing.*;
import java.util.ArrayList;

public class ToDoList {

    public ToDoList() {
        String[] list;
    }

    ToDoList list = new ToDoList();

    public void add(String task) {
        list.add(task);
    }

    public void print(String[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.println("Element: " + i + ", value: " + list[i]);
        }
    }

    public void remove(int number) {
        list.remove(number);
    }
}
