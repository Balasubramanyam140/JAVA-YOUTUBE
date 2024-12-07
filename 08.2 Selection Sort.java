Selection Sort Steps:
Initial Array: [5, 3, 4, 1, 2]
  i =0
Step 1 (Find smallest and swap with first element):
Swap 5 and 1 → [1, 3, 4, 5, 2]
  i =1
Step 2 (Find smallest in remaining and swap with second element):
  i =2
Swap 3 and 2 → [1, 2, 4, 5, 3]
Step 3 (Find smallest in remaining and swap with third element):
  i =3
Swap 4 and 3 → [1, 2, 3, 5, 4]
Step 4 (Find smallest in remaining and swap with fourth element):
  i =4
Swap 5 and 4 → [1, 2, 3, 4, 5]
Final sorted array: [1, 2, 3, 4, 5].

  
import java.util.Arrays;
class Main{
    public static void main(String[] args){
        int[] arr = { 4, 5, 1, 2, 3};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            int min =i;
            for(int j=i+1; j<n; j++){
                 if(arr[j] < arr[min]){
                    int temp = arr[min];
                     arr[min] = arr[j];
                     arr[j]= temp;
                 }
             }
        }   
    }
}


OUTPUT :
         [1, 2, 3, 4, 5]
---------------------------------------------------------------------------------------
