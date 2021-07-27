package com.algorithms;

public class BinarySearch {

    public Integer find(Integer[] array, Integer value) {

        Integer l = 0;
        Integer r = array.length;

        while(l <= r) {
            Integer m = l + (r-l)/2; // over come integer overflow

            if(array[m] == value)
            {
                return m; // found the element
            }
            if(array[m] > value ) {
                /*
                l          m          r
                |----------|----------|
                     ^     ^
                     |     |
                    Value
                 */
                r = m -1;
            }
            else
            {
                l = m + 1;
            }
        }

        return -1; // If the element is not found;
    }
}
