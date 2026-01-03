public class CountPathMaze {

    public static int CountPath(int i, int j, int n, int m){

        // Base Conditions 

        if(i==n || j==m){      
            return 0;
        }

        if(i==n-1 && j==m-1){  
            return 1;

        }
        // move Down path :

        int DownPath = CountPath(i+1, j, n, m);

        // move Right path :

       int RightPath = CountPath(i, j+1, n, m);
       
       return DownPath + RightPath ; 
    } 
    public static void main(String[] args) {
        int n=3;
        int m=3;

        int TotalPath = CountPath(0, 0, n, m);
        System.out.println(TotalPath);

    }
}

// TIme COmplexity = O(2^(m+n)) 

