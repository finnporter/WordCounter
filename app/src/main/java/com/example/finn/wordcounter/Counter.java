package com.example.finn.wordcounter;

/**
 * Created by Finn on 04/07/2017.
 */

public class Counter {
    private String input;
    private String[] words;

    public Counter(String input) {
        this.input = input;
        this.words = input.split(" ");
    }

    public String getInput() {
        return input;
    }
}
