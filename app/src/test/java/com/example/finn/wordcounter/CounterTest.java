package com.example.finn.wordcounter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Finn on 04/07/2017.
 */

public class CounterTest {
    Counter counter;

    @Before
    public void before() {
        counter = new Counter("However, it didn't work.");
    }

    @Test
    public void hasInput() {
        assertEquals("However, it didn't work.", counter.getInput());
    }

    @Test
    public void countsWords() {
        Counter words = new Counter("Lorem ipsum ipsum");
        assertEquals(3, words.countWords());
    }

    @Test
    public void ignoresWordsWithPunctuation() {
        assertEquals("However it didnt work", counter.getInput().replaceAll("[^a-zA-Z ]", ""));
        assertEquals(4, counter.countWords());
    }

    @Test
    public void inputIsLowercase() {
        assertEquals("however, it didn't work.", counter.getInput().toLowerCase());
    }

    @Test
    public void inputIsCorrectFormat() {
        assertEquals("however it didnt work", counter.getInputInCorrectFormat());
    }


}
