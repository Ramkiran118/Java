// Print all the SUbSequences of  a String .

public class SubSequences {
    
    public static void PrintSubSequences(String str, int idx, String NewString){

        // BASE CASE // 

        if(idx==str.length()){
            System.out.println(NewString);
            return;
        }

        char Current = str.charAt(idx);  // TO convert the String to Characters .

        // To DO :

        PrintSubSequences(str, idx+1, NewString+Current);

        // TO NOT DO :

        PrintSubSequences(str, idx+1, NewString);
    } 
    public static void main(String[] args) {
        String str = "abc";
        PrintSubSequences(str, 0, "");
    }
}

// TIME COMPLEXITY --> O(2^n)
