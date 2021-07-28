package com.algorithms;

public class Sorting {

    public Integer[] insertionSort(Integer[] array){

        for( int i = 1 ;i < array.length; i++)
        {
            Integer key = array[i];
            Integer j = i-1;
            while(j>=0 && array[j]>key)
            {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = key;
        }

        return  array;
    }
}
