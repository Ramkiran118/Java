import java.util.*;

public class PrintFactorial {

    public static int PrintFactorial(int n){
        if(n==0||n==1){
            return 1;
        }

        int Factorial=PrintFactorial(n-1);
        int Factorial_m=n*Factorial;
        return Factorial_m;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the n value :");
        int n=sc.nextInt();

        int Ans=PrintFactorial(n);
        System.out.println(Ans);

    }
    
}
