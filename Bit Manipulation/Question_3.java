//  WRITE A PROGRAM TO COUNT THE NUMBERS OF 1'S IN A BINARY REPRESENTATION OF THE NUMBERS 

import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;
        int temp = num;

        while (temp != 0) {
            count += (temp & 1); 
            temp = temp >> 1;    
        }

        System.out.println("Number of 1's in binary representation of " + num + " is: " + count);
    }
}
