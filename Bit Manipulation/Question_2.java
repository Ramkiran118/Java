// Write a program to toggle a bit a position = “pos” in a number “n”.

import java.util.*;
public  class Question_2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the n value :");
        int n=sc.nextInt();

        System.out.print("Enter the Pos value :");
        int pos=sc.nextInt();

        int BitMask=1<<pos;

        int NewNumber=n^(BitMask);

        System.out.println("Number After the Toggle the bit with"+ pos +"is :"+ NewNumber);
        System.out.println("binary is : "+ Integer.toBinaryString(NewNumber));

    }
}