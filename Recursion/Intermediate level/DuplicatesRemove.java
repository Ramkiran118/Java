public class DuplicatesRemove {
    
    public static boolean[] map= new boolean[26];  // WE have taken the all the Alphabets in a Array formate For no Duplications using Boolean Function.

    public static void RemoveDuplicate(String str , int idx , String NewString){

        // BASE CASE

        if(idx==str.length()){
            System.out.println(NewString);  
            return;
        }

        // to convert the String to the Character 

        char CurrChar =str.charAt(idx);
        if(map[CurrChar - 'a']==true){        // IF Current Character is SUbtracted From Character 'a' we get Zero, if its True Then REad the Next Index. 
            RemoveDuplicate(str, idx+1, NewString);
        
        }
        else{
            NewString += CurrChar;    // IF there is No REpeated Characters Write Same String in the NewString .
            map[CurrChar -'a']=true;
            RemoveDuplicate(str, idx+1, NewString);

        }
    }

    public static void main(String[] args) {
        String str="abaacadeafagahijkalam";
        RemoveDuplicate(str, 0, "");
        
    }
}

//  // TIME COMPLEXITY --> O(n)