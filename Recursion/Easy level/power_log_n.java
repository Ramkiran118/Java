import java.util.*;
public class power_log_n {
    public static int Print_Power(int x,int n){
        if(n==0){
            return 1;

        }
        if(x==0){
            return 0;

        }
        if(n%2==0){
           return Print_Power(x, n/2) * Print_Power(x, n/2);

        }
        else{
            return Print_Power(x, n/2) * Print_Power(x, n/2) * x;

        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the x value :");
        int x=sc.nextInt();
        System.out.print("Enter the n value :");
        int n=sc.nextInt();

        int Ans=Print_Power(x, n);

        System.out.println(Ans);
    }
}