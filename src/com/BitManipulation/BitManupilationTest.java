package com.BitManipulation;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;

public class BitManupilationTest {

    @Rule
    public Timeout globalTimeout = Timeout.seconds(1);

    @Test(timeout=1000)
    public void testZeroParity() {

        BitManupilation bm = new BitManupilation();
        Integer expected = 0;
        Integer actual = bm.parity(0);
        assertEquals(expected, actual);
    }

    @Test(timeout=1000)
    public void testOddParity() {

        BitManupilation bm = new BitManupilation();
        Integer expected = 1;
        Integer actual = bm.parity(1);
        assertEquals(expected, actual);
    }

    @Test(timeout=1000)
    public void testEvenParity() {

        BitManupilation bm = new BitManupilation();
        Integer expected = 0;
        Integer actual = bm.parity(10);
        assertEquals(expected, actual);
    }

    @Test(timeout=1000)
    public void testNegativeEvenParity() {

        BitManupilation bm = new BitManupilation();
        Integer expected = 0;
        Integer actual = bm.parity(10);
        assertEquals(expected, actual);
    }

    @Test(timeout=1000)
    public void testIntegerMaxParity() {

        BitManupilation bm = new BitManupilation();
        Integer expected = 1;
        Integer actual = bm.parity(Integer.MAX_VALUE);
        assertEquals(expected, actual);
    }

    @Test
    public void testIntegerMinParity() {

        BitManupilation bm = new BitManupilation();
        Integer expected = 0;
        Integer actual = bm.parity(Integer.MIN_VALUE);
        assertEquals(expected, actual);
    }

    @Test(timeout=1000)
    public void testIntegerMaxFastParity() {

        BitManupilation bm = new BitManupilation();
        Integer expected = 1;
        Integer actual = bm.fastParity(Integer.MAX_VALUE);
        assertEquals(expected, actual);
    }

    @Test(timeout=1000)
    public void testIntegerMaxSuperFastParity() {

        BitManupilation bm = new BitManupilation();
        Integer expected = 1;
        Integer actual = bm.superFastParity(Integer.MAX_VALUE-1);
        assertEquals(expected, actual);
    }

}