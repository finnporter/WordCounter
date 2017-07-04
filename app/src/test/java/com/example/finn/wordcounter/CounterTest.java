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
        counter = new Counter("Lorem ipsum ipsum");
    }

    @Test
    public void hasInput() {
        assertEquals("Lorem ipsum ipsum", counter.getInput());
    }


}
