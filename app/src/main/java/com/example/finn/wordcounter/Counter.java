package com.example.finn.wordcounter;

import java.util.HashMap;

/**
 * Created by Finn on 04/07/2017.
 */

public class Counter {
    private String input;
    private String[] words;

    public Counter(String input) {
        this.input = input;
        this.words = input.split("\\s+");
        //replaceAll("[^a-zA-Z ]", "").toLowerCase()
        //not sure how exactly this works. thanks StackOverflow.
    }

    public String getInput() {
        return this.input;
    }

    public int countWords() {
        return this.words.length;
    }

    public String getInputInCorrectFormat() {
        return this.input.replaceAll("[^a-zA-Z ]", "").toLowerCase();
    }

    public HashMap<String, Integer> frequency() {
        HashMap<String, Integer> results = new HashMap<>();
        for (int num = 0; num < words.length; num++) {
            if (results.containsKey(words[num])) {
                Integer count = results.get(words[num]);
                results.put(words[num], count + 1);
            }
            else {
                results.put(words[num], 1);
            }

        }
        return results;

    }
}
