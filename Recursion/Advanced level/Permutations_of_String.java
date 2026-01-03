public class Permutations_of_String {

    public static void PrintPermu(String str, String Permutation){

        // base Condition
    
        if(str.length()==0){
            System.out.println(Permutation);
            return;
        }

        //  converting the String to Characters using For loop.

        for(int i=0;i<str.length();i++){
            char current = str.charAt(i);


            //  Storing the sequences in the Newstr variable.
            
            String Newstr = str.substring(0, i)+str.substring(i+1);

            PrintPermu(Newstr, Permutation + current);

        }
    }

    public static void main(String[] args) {
        String str =  "abc";
        PrintPermu(str, "");
    }
}

// Time Complexity = O(n!)