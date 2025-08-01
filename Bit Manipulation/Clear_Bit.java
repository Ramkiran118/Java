// clear the 3rd bit(position = 2) of a Number n (n=0101)
// 1) BitMask : 1<<i;
// 2) Operation : AND with NOT ;

import java.util.*;
public class Clear_Bit {

    public static void main(String[] args) {
        int n=5;
        int pos=2;
        int BitMask=1<<pos;
        int NotBitMask=~BitMask;

        int newNumber=NotBitMask & n;
        System.out.println(newNumber);


    }
}