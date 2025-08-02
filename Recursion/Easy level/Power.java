import java.util.Scanner;

public class Power {
    public static double cal_poower(double x,double n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;

        }
        double power=cal_poower(x, n-1);
        double Print_Power= x * power;
        return Print_Power;



    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the x value :");
        double x=sc.nextDouble();
        System.out.print("Enter the n value :");
        double n=sc.nextDouble();

        double Ans=cal_poower(x, n);
        System.out.println(Ans);
    }
}