// Print the Keypad Combination ?

public class MobileKeypad {

    public static String [] Keypad ={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void PrintKeypad(String str, int idx,String Combination){

        // BASE CASE
        
        if(idx==str.length()){
            System.out.println(Combination);
            return;

        }

        char CurrChar = str.charAt(idx); // To Conver the String to Character.

        String Mapping = Keypad[CurrChar-'0'];  // Subtracting the Current Value to 0 we get the Current value and then Storing in Mapping variable.

        for(int i=0;i<Mapping.length();i++){  //creating the loop 
            PrintKeypad(str, idx+1, Combination+Mapping.charAt(i)); // Combination will repeate until all the cases of i.
        }
    }


    public static void main(String[] args) {
        String str = "7";
        PrintKeypad(str, 0, "");

    }
}
// TIME COMPLEXITY --> O(4^n)