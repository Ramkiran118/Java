// Get the 3rd bit (position=2) of a Number n (n=0101)
// 1) Bit mask : 1<<i
// 2) operattion : And

import java.util.*;
public class get__Bit {

    public static void main(String[] args) {
        int n=5;
        int pos = 3;
        int Bitmask=1<<pos;


        if((Bitmask & n)==0){
            System.out.println("BitMask is Zero.");
        }
        else{
            System.out.println("BitMask is One");
        }
    }
}