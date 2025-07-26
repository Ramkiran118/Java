import java.util.*;
public class Solutions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input;
        do {
            int marks=sc.nextInt();
            if  (marks>=90 && marks<=100) {
                System.out.println("this is good");
            }
            else if (90>marks && marks>=60) {
                System.out.println("this is also good");
            }
            else if (marks<60 && marks>=0) {
                System.out.println("this also good as well");
            }
            else
            {
                System.out.println("invalide");
            }
            System.out.println("want to continue ?(yes(1) or no(0))");
            input=sc.nextInt();
        } while ( input==1);
    }

    
}