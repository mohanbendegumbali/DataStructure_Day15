package com.hashtables;

import java.util.LinkedList;

public class RemoveAvoidableWord {

    public static void main(String[] args) {
        String phrase = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        String[] words = phrase.split(" ");

        // Create a LinkedList of MyMapNode objects
        LinkedList<MyMapNode> wordList = new LinkedList<>();

        // Add each word to the wordList with its count as the value
        for (String word : words) {
            MyMapNode node = null;
            for (MyMapNode n : wordList) {
                if (n.getKey().equals(word)) {
                    node = n;
                    break;
                }
            }
            if (node == null) {
                node = new MyMapNode(word, 1);
                wordList.add(node);
            } else {
                node.setValue(node.getValue() + 1);
            }
        }

        // Remove the word "avoidable" from the wordList
        for (MyMapNode node : wordList) {
            if (node.getKey().equals("avoidable")) {
                wordList.remove(node);
                break;
            }
        }

        // Print the updated phrase
        StringBuilder result = new StringBuilder();
        for (MyMapNode node : wordList) {
            for (int i = 0; i < node.getValue(); i++) {
                result.append(node.getKey()).append(" ");
            }
        }
        System.out.println(result.toString().trim());
    }

    // Custom class to represent a key-value pair
    static class MyMapNode {
        private String key;
        private int value;

        public MyMapNode(String key, int value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }
}

