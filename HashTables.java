package com.hashtables;

import java.util.Hashtable;

public class HashTables {
    public static void main(String[] args) {
        String sentence = "To be or not to be";
        Hashtable<String, Integer> freq = new Hashtable<>();

        // Split the sentence into words
        String[] words = sentence.split(" ");

        // Count the frequency of each word
        for (String word : words) {
            if (freq.containsKey(word)) {
                freq.put(word, freq.get(word) + 1);
            } else {
                freq.put(word, 1);
            }
        }

        // Print the frequency of each word
        for (String word : freq.keySet()) {
            System.out.println(word + ": " + freq.get(word));
        }

    }
}