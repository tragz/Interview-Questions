package com.BitManipulation;

public class BitManupilation {

    public Integer parity(Integer value) {
        //// Count the number of bits set to 1 and do modulo 2
        Integer count = 0;
        if(value < 0)
        {
            value = value * -1;
        }

        while( value != 0  ) {      /// while number is NON ZERO
            if((value & 1) != 0 )  /// Anding with right most bit with 1
            {
                count++;           /// the right most bit is one, increment the counter
            }
            value >>= 1;           /// right shift the bits in the number
        }

        return count % 2 ;
    }

    public Integer fastParity(Integer value) {
        Integer count = 0;
        while( value != 0) {             ///  while the value is not ZERO
            count ^= 1;                  ///  XOR with 1 if even number of 1 in the binary it will 0 else 1
            value = value & (value -1);  ///  Mask the least significant one position until first 1 ext 1010 & 1001 = 1000 ( 10 & 9 = 8 ) thus only moving to next available 1 poisiton
                                         ///  Maximums 32 times the loop runs
        }
        return count;
    }

    public Integer superFastParity(Integer value)
    {
        System.out.println(Integer.toBinaryString(value));
        value = value ^ (value >> 16)
        value ^= value >> 16;
        value ^= value >> 8;
        value ^= value >> 4;
        value ^= value >> 2;
        value ^= value >> 1;

        return value & 0x1;
    }
}
