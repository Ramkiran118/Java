import java.util.*;

public class String_Reverse {

    public static void PrintReverse(String str,int idx){
        if (idx==0) {
            System.out.println(str.charAt(idx));
            return;

        }
        System.out.print(str.charAt(idx)+" ");
        PrintReverse(str, idx-1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String ");
        String str=sc.next();
        
        PrintReverse(str, str.length()-1);


    }
}