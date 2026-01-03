// Place tiles of size 1 x m in a flow of size n x m

public class Tiling_Problem {

    public  static int PlaceTile(int n, int m){

        // Base case 
        
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }

        // Vertically :

        int Verplacement = PlaceTile(n-m, m);

        // Horizontally :
         
        int HoriPlacements = PlaceTile(n-1, m);


        return Verplacement + HoriPlacements;
    }

    public static void main(String[] args) {
        
        int n=4;
        int m=2;

        System.out.println(PlaceTile(n, m));
    }


    
}
