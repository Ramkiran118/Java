import java.security.Principal ;

public class Tower_of_Hanoi {

    public static void TowerOfHanoi(int n,String src,String Helper,String Dest ){


        if(n==1){
            System.out.println("Transfer the Disk " + n + " from " + src + " to " + Dest );
            return;

        }
        TowerOfHanoi(n-1, src, Dest, Helper);
        System.out.print(" Transfer the Disk " + n + " from " + src + " to " + Dest );
        TowerOfHanoi(n-1, Helper, src, Dest);
    }

    public static void main(String[] args) {
        
        int n=3;
        TowerOfHanoi(n, "S", "H", "D");
    }
}
