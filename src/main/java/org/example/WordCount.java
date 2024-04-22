package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class WordCount {

    public WordCount() {

    }
    public HashMap<String, Integer> wordCount(String text) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : text.split("[\\s\\-\\.\\'\\?\\,\\_\\@]+")) {
            int i = map.getOrDefault(word, 0) + 1;
            map.put(word, i);
        }
        return map;
        }
}
