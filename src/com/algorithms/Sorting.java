package com.algorithms;

public class Sorting {

    public Integer[] insertionSort(Integer[] array){

        // for empty array or array with ONLY 1 element it is already sorted
        for( int i = 1 ;i < array.length; i++)     /// Start from index = 1 element
        {
            Integer key = array[i];                /// make the element at index = i as KEY
            Integer j = i-1;                       /// KEY can be any where Array[0] <= KEY <= Array[i]
            while(j>=0 && array[j]>key)            /// Loop till j >= 0 and Array[j] > KEY i.e KEY is left of Array[j]
            {
                array[j+1] = array[j];             /// As we need to move all the elements backwards and insert the KEY at its right position
                j--;                               /// update Array[j+1] to Array[j]
            }
            array[j+1] = key;                      /// At this point we found the position of KEY in the already SORTED Array insert the element.
        }

        return  array;
    }
}
