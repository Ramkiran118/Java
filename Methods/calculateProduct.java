import java.util.*;
public class calculateProduct {
    public static int calculateProduct(int a,int b){
        int Product=a*b;
        return Product;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        int Product=calculateProduct(a, b);
        System.out.println("The Product is : "+ Product); 
    }
}
