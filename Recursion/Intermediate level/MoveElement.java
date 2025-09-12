// Move all the X elements To the End of the String.
// Example :  ["abaabbxbbxbabaxb" --> "abaabbbbbababxxx"].

public class MoveElement {
    public static void MoveElements(String str, int idx, int count, String NewString){


        // BASE CASE //

        if(idx == str.length()-1){
            for(int i=0;i<count;i++){    // counting the number of X's in a string 
                NewString +='x';         // Adding the all X's at last of String .
            }
            System.out.println(NewString);
            return;
        }

    // COnverting the String to Character readable.
    
        char CurrElement = str.charAt(idx);  

        if(CurrElement == 'x'){       // IF The 'x' equal to  element in the String just count without Printing.
            count++ ;

            MoveElements(str, idx+1, count, NewString);  // move forward to count in the String.
        }
        else{
            NewString += CurrElement;     // else Print the Present string with New String.
            MoveElements(str, idx+1, count, NewString);
        }
    }

    public static void main(String[] args) {
        String str ="ababxabxbaxac";
        MoveElements(str, 0, 0, "");
    }
    
}

// TIME COMPLEXITY --> O(n + count ) --> O(2n) -->  O(n). //