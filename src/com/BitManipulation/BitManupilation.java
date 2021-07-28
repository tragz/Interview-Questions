package com.BitManipulation;

public class BitManupilation {

    public Integer parity(Integer value) {
        //// Count the number of bits set to 1 and do modulo 2
        Integer count = 0;
        while( value != 0  ) {      /// while number is NON ZERO
            if((value & 1) != 0 )  /// Anding with right most bit with 1
            {
                count++;           /// the right most bit is one, increment the counter
            }
            value >>= 1;           /// right shift the bits in the number
        }

        return count % 2 ;
    }
}
