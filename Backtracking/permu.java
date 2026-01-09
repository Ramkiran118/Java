public class permu {

    public static void PrintPermutation(String str, int idx, String Perm){

        if(str.length()==0){
            System.out.println(Perm);
            return;

        }

        for(int i=0;i<str.length();i++){
            char CurrChar=str.charAt(i);

            String newString=str.substring(0, i)+str.substring(i+1);
            PrintPermutation(newString, idx+1, Perm + CurrChar);
        }

    }

    public static void main(String[] args) {
        String str="ABC";

        PrintPermutation(str, 0, "");
    }
}
