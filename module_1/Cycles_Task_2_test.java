package com.epam.dziamidau.main;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.epam.dziamidau.main.Main.m;
import static org.junit.Assert.*;

public class MainTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void t1() {
        assertEquals(-1, m(1), 0.001);
    }
    @Test
    public void t2() {
        assertEquals(4, m(4), 0.001);
    }

}