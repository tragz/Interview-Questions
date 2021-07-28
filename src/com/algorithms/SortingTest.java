package com.algorithms;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.junit.Assert.*;

public class SortingTest {

    @Rule
    public Timeout globalTimeout = Timeout.seconds(10);

    @Test
    public void testInsertionSort() {
        Sorting sort = new Sorting();
        Integer[] array = {10, 90, 20, 80, 30, 70, 40, 60, 50};
        List<Integer> arrayList = Arrays.asList(array);
        Collections.sort(arrayList);

        List sorteArray = Arrays.asList(sort.insertionSort(array));
        assertTrue(arrayList.equals(sorteArray));
    }

    @Test
    public void testEmptyInsertionSort() {
        Sorting sort = new Sorting();
        Integer[] array = {};
        List<Integer> arrayList = Arrays.asList(array);
        Collections.sort(arrayList);

        List sorteArray = Arrays.asList(sort.insertionSort(array));
        assertTrue(arrayList.equals(sorteArray));
    }

    @Test
    public void testSortedInsertionSort() {
        Sorting sort = new Sorting();
        Integer[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        List<Integer> arrayList = Arrays.asList(array);
        Collections.sort(arrayList);

        List sorteArray = Arrays.asList(sort.insertionSort(array));
        assertTrue(arrayList.equals(sorteArray));
    }

    @Test
    public void testReverseSortedInsertionSort() {
        Sorting sort = new Sorting();
        Integer[] array = {90, 80, 70, 60, 50, 40, 30, 20, 10};
        List<Integer> arrayList = Arrays.asList(array);
        Collections.sort(arrayList);

        List sorteArray = Arrays.asList(sort.insertionSort(array));
        assertTrue(arrayList.equals(sorteArray));
    }

}