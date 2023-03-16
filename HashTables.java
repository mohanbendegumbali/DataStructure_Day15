package com.hashtables;

import java.util.Hashtable;

public class HashTables {
    String sentence = "To be or not to be";
    Hashtable<String, LinkedList<Integer>> wordFreq = new Hashtable<>();

    String[] words = sentence.toLowerCase().split("\\W+");

        for (String word : words) {
        LinkedList<Integer> freqList = wordFreq.get(word);
        if (freqList == null) {
            freqList = new LinkedList<>();
            freqList.add(1);
            wordFreq.put(word, freqList);
        } else {
            freqList.add(freqList.getLast() + 1);
        }
    }
        
        for (String word : wordFreq.keySet()) {
        LinkedList<Integer> freqList = wordFreq.get(word);
        int frequency = freqList.getLast();
        System.out.println(word + ": " + frequency);
    }

}
}
