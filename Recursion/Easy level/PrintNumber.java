// Print Numbers from 5 to 1 using Recursion

// public class PrintNumber {
//     public static void PrintNumber(int n){
//         if(n==0){
//             return;
//         }
//         System.out.println(n);
//         PrintNumber(n-1);

//     }

//     public static void main(String[] args) {
//         int n=5;
//         PrintNumber(n);
//     }
// }

// PRINT NUMBERS FROM 1 TO 5 USING RECURSION:

public class PrintNumber {
    public static void PrintNumber(int n){
        if (n==6) {
            return;
        }
        System.out.println(n);
        PrintNumber(n+1);
    }

    public static void main(String[] args) {
        int n=1;

        PrintNumber(n);

    }
}