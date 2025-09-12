// Check if an Array is Sorted (Strictly increasing same numbers are not equal) ? 

//  Example :  [1,2,3,4] --> Strictly Increasing .\
//  Example :  [1,2,3,3,4] --> Its not because 3 had came two times.


public class ArraySorted {

    public static boolean isSorted(int arr[], int idx){

        if(idx == arr.length-1){
            return true;              // BASE CONDITION.
        }

        if(arr[idx] < arr[idx+1]){  // If Present Index value is less then next Index value .

            return isSorted(arr, idx+1);    //  COntinue with checking the next value in a forward.


        }
        
        //  if condition failes then give False.
        else{
            return false;
        }
        
    }
    public static void main(String[] args) {
        int arr[]={2,4,7,10};
        System.out.println(isSorted(arr, 0));
        
    }
}
//    TIME COMPLEXITY IS --> O(n)