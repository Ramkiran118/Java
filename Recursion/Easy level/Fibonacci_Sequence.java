import java.util.*;
public class Fibonacci_Sequence {
    public static void PrintFib(int a,int b,int n){


    if(n==0){
        return;
    }

    int c=a+b;
    System.out.println(c);
    PrintFib(b, c, n-1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the n value :");
        int n=sc.nextInt();
        int a=0;int b=1;
        System.out.println(a);
        System.out.println(b);

        PrintFib(a, b, n-2);
    }
}