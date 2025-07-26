import java.util.Scanner;
public class calculaterprimenumber {

    public static void primeNumber(int num){
        boolean isprime=true;
       
        for(int i=2;i<num;i++){
            if (num%i==0) {
                isprime=false;
                break;
            }
        }
        if (isprime) {
            System.out.println(num+": is a Prime Number");
        }
        else{
            System.out.println(num+":is Not a Prime Number");
        }
    
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
         
        primeNumber(num);
         
        
    }
}