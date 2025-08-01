// Update the 2nd bit (Position =1) of a number  n to 1 (n=0101)
// for 0:
// BitMask : 1<<i;
// Operation : AND with NOT

// for 1:
// BitMask : 1<<i;
// Operation : OR

// for 1:
import java.util.*;
public class Update_bit {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the operation : ");
        int operation=sc.nextInt();

        int n=5;
        int pos=2;
        int BitMask=1<<pos;
        if(operation==1){
            int newNumber=BitMask |n;
            System.out.println(newNumber);
        }
        else{
            int NotBitMask=~(BitMask);
            int newNumber=NotBitMask & n;
            System.out.println(newNumber);
        }
    }
}