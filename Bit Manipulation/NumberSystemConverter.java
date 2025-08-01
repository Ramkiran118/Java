import java.util.*;
public class NumberSystemConverter {

    public static String decimaltobinary(int decimal){
        if(decimal==0)
        return "0";

        StringBuilder binary= new StringBuilder();

        while(decimal>0){
            binary.insert(0,decimal%2);
            decimal=decimal/2;
        }
        return binary.toString();
    }

    public static int binaryTodecimal(String binary){
        int decimal=0;
        int power=0;

        for(int i=binary.length()-1;i>=0;i--){
            char bit = binary.charAt(i);

            if(bit =='1'){
                decimal += Math.pow(2,power);
            }
            power++;

        }
        return decimal;

    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        // Decimal to Binary :

        System.out.print("Enter the decimal :");
        int decimal=sc.nextInt();

        System.out.println("Binary :"+ decimaltobinary(decimal));

        // Binary to Decimal :

        System.out.print("Enter the Binary :");
        String Binary = sc.next();

        System.out.println("Decimal :"+ binaryTodecimal(Binary));

    }
}
