// Find the number of ways in which you can invites n people to your party , single (or) pairs .

public class FriendsPairing {

    public static int CallGuest(int n){

        // Base condition 

        if(n<=1){
            return 1;

        }
        // single 

        int way1 = CallGuest(n-1);

        // pair 

        int way2 =  (n-1) * CallGuest(n-2);

        return way1 + way2;

    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(CallGuest(n));

    }
}