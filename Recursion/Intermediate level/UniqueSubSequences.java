// Print all the unique Subsequences of a String ? [ Example "aaa" ]

import java.util.HashSet;

public class UniqueSubSequences {
    public static void PrintSubSequences(String str, int idx, String NewString, HashSet<String>set){

        // BASE case //

        if(idx == str.length()){

            if(set.contains(NewString)){          // It is used for Uniqueness .
                return;

            }
            System.out.println(NewString);
            set.add(NewString);
            return;

        }

        char CurrChar = str.charAt(idx);  // To Convert the String to Character.
         
        // TO BE :

        PrintSubSequences(str, idx+1, NewString+CurrChar,set); 

        // TO NOT BE :

        PrintSubSequences(str, idx+1, NewString,set);
    }

    public static void main(String[] args) {
        String str="aaa";
        HashSet<String>set = new HashSet<>();
        PrintSubSequences(str, 0, "", set);
        
    }
}
// TIME COMPLEXITY --> O(2^n)