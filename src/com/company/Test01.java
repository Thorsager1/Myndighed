package com.company;

import static org.junit.Assert.assertTrue;

public class Test01 {
    Myndighed testMyndighed = new Myndighed();

    @org.junit.Test
    public void myndig() {

        assertTrue(testMyndighed.myndig(21));

    }
}


