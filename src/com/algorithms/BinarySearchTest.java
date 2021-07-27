package com.algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

    private BinarySearch search;

    @Before
    public void setUp() throws Exception {
        search = new BinarySearch();
    }

    @Test
    public void testFind() {

        Integer[] array = {10, 20, 30, 40 , 50, 60};

        Integer pos = search.find(array, 40);

        assertEquals("The posistion of 40 is 3", (Integer)3, (Integer)pos);
    }

    @Test
    public void testNumberGreaterThanLargestFind() {

        Integer[] array = {10, 20, 30, 40 , 50, 60};
        Integer expected = -1;
        Integer acutal = search.find(array, 100);

        assertEquals("The posistion of 40 is -1", expected, acutal);
    }

    @Test
    public void testNumberLessThanSmallestFind() {

        Integer[] array = {10, 20, 30, 40 , 50, 60};
        Integer expected = -1;
        Integer acutal = search.find(array, 0);

        assertEquals("The posistion of 0 is -1", expected, acutal);
    }

    @Test
    public void testEmptyFind() {

        Integer[] array = {};
        Integer expected = -1;
        Integer actual = search.find(array, 40);

        assertEquals("The posistion of 40 is -1", expected, actual);
    }

    @Test
    public void testOneElementNotInArrayFind() {

        Integer[] array = {10};
        Integer expected = -1;
        Integer actual = search.find(array, 40);

        assertEquals("The posistion of 40 is -1", expected, actual);
    }

    @Test
    public void testOneElementInArrayFind() {

        Integer[] array = {10};
        Integer expected = 0;
        Integer actual = search.find(array, 10);

        assertEquals("The posistion of 10 is 0", expected, actual);
    }

}