package org.example;

import javax.swing.*;
import java.util.ArrayList;

public class ToDoList {

    private String[] list;
    private int lastEmpty = 0;

    public ToDoList() {
        this.list = new String[10];
    }


    public void add(String task) {
        if (lastEmpty != list.length-1) {
            list[lastEmpty] = task;
            lastEmpty++;
        }
    }

    public void print() {
        for (int i = 0; i < list.length; i++) {
            System.out.println("Element: " + i + ", value: " + list[i]);
        }
    }

    public void remove(int number) {
        if (number <= list.length) {
            list[number] = null;
        }
    }
}
