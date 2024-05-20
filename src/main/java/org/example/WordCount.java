package org.example;

import java.util.HashMap;

public class WordCount {

    public HashMap<String, Integer> wordCount(String text) {
        HashMap<String, Integer> map = new HashMap<>();
        if (text != null) {
            for (String word : text.split("[\\s\\-\\.\\'\\?\\,\\_\\@]+")) {
                if (map.containsKey(word)) {
                    map.put(word, map.get(word) + 1);
                } else {
                    map.put(word, 1);
                }
            }
        }
        return map;
    }
}