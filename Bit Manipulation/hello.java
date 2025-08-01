import java.util.*;
public class hello {

    public static String decimaltobinary(int Decimal){
        if (Decimal==0) 
        return "0";

        StringBuilder Binary=new StringBuilder();
        while(Decimal>0){
            Binary.insert(0,Decimal%2);
            Decimal=Decimal/2;

        }
        return Binary.toString();
    }

    public static int BinaryToDecimal(String Binary){
        int Decimal=0;
        int Power=0;
        for(int i=Binary.length()-1;i>=0;i--){
            char bit=Binary.charAt(i);

            if(bit=='1'){
                Decimal +=Math.pow(2,Power);
                Power++;
            }


        }
        return Decimal;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Decimal :");
        int Decimal=sc.nextInt();
        System.out.println("Binary : "+ decimaltobinary(Decimal));

        System.out.print("Enter the Binary :");
        String Binary=sc.next();
        System.out.println("Decimal :"+ BinaryToDecimal(Binary));
    }


}