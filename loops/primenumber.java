import java.util.Scanner;
public class primenumber {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
     
    boolean isprime=true;
    for(int i=2;i<num;i++){
        if (num%i==0) {
            isprime=false;
            break;
        }

    }
    if (isprime) {
        System.out.println(num+": Is Prime Number");
    }
    else{
        System.out.println(num+":It is Not a Prime Number");
    }
   }

}
