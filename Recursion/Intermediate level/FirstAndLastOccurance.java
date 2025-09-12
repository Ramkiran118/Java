// Find the first and last occurance of an element in a string ?

public class FirstAndLastOccurance {
    public static int First = -1; // iniatializing First as -1
    public static int Last =-1;   // initializing LAst as -1
    public static void FindOccurance(String str, int idx, char element){
       

        if(idx==str.length()-1){
            System.out.println(First);  // Base Condition
            System.out.println(Last);
            return;

        }
        
        char currChar = str.charAt(idx);  // Converting the String into Character readable.
        
        if(currChar == element){    // checking the given element condition with the Existing Character.
            if(First == -1){            
                First = idx;    // if there the index of the Element is marked as First . 
            }
            else{
                Last = idx;          // else it is marked as Last.
            }
        }
        // increasing the index to read all the forward elements.

        FindOccurance(str, idx+1, element);   


    }

    public static void main(String[] args) {
        String str="abaabbacade";
        FindOccurance(str, 0, 'b');

        
    }
}
