import java.util.*;

public class sum_of_first_n {
    public static void PrintSum(int i,int n,int sum){
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        
        sum+=i;
        PrintSum(i+1, n, sum);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=1;
        System.out.print("Enter the n value :");
        int n=sc.nextInt();
        int sum=0;

        PrintSum(i, n, sum);
    }
} 