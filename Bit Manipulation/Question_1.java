// Write a program to find if a number is a power of 2 or not.

import java.util.*;
public class Question_1 {

    public static boolean isPowerof2(int n){
        if(n<=0){
        return false;
        }
        else{
        return (n & (n-1))==0;
        }
        }

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("enter the Number :");
            int n=sc.nextInt();

            if (isPowerof2(n)) {
                System.out.println(n+ " is the power of 2");
                
            }
            else{
                System.out.println(n+ " is not  power of 2");
            }

        }
    }
