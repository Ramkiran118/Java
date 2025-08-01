import java.util.*;
public class Selection_Sort {

    public static void PrintArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[]={7,9,4,2,1,5};
        
        for(int i=0;i<arr.length-1;i++){
            
            int Smallest=i;
            for(int j=i+1;j<arr.length;j++){

                if(arr[Smallest]>arr[j]){
                    Smallest=j;
                }
            }
            int temp=arr[Smallest];
            arr[Smallest]=arr[i];
            arr[i]=temp;

        }
        PrintArray(arr);
    }
}