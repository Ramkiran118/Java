// Print all the Subsets of a set of First n Natural Numbers.

import java.util.ArrayList;
import java.util.PrimitiveIterator;

public class Subsets_Of_Set {

    public static void PrintSubset(ArrayList<Integer>Subset){

        for(int i=0;i<Subset.size();i++){
            System.out.print(Subset.get(i)+" ");

        }
        System.out.println();

    }
    public static void FindSubsets(int n, ArrayList <Integer> Subset){

        // Base Condition
        
        if(n==0){
            PrintSubset(Subset);
            return;
        }
        // add 

        Subset.add(n);          //  the n is added in the last index.
        FindSubsets(n-1, Subset);
        
        // Don't Add 

        Subset.remove(Subset.size()-1);  // the added n is removed which is sotred in the last index.
        FindSubsets(n-1, Subset);
    }


    public static void main(String[] args) {
        int n=3;
        ArrayList <Integer> Subset = new ArrayList<>();
        FindSubsets(n, Subset);
        
    }
    
}
