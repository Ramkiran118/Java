// Set the 2nd bit (Position = 1) of a Number n (n=0101)
// 1) bit Mask : 1<<i;
// 2) Operation : OR;

import java.util.*;
public class Set_Bit {

    public static void main(String[] args) {
        int n=5;
        int pos = 1;
        int Bitmask=1<<pos;

        int newNumber=Bitmask|n;
        System.out.println(newNumber);

    }
}