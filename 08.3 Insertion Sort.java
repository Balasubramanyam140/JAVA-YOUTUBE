array [5, 3, 4, 1, 2]:

Initial Array: [5, 3, 4, 1, 2]         i =0   j =1
Step 1 (Insert 3): [3, 5, 4, 1, 2]      i=1     j=2
Step 2 (Insert 4): [3, 4, 5, 1, 2]      i=2     j=3
Step 3 (Insert 1): [1, 3, 4, 5, 2]      i=3      j=4  
Step 4 (Insert 2): [1, 2, 3, 4, 5]      -- SORTED
------------------------------------------------------------------------

import java.util.Arrays;
class Main{
    public static void main(String[] args){
        int[] arr = { 4, 5, 1, 2, 3};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion(int[] arr){
        for(int i=0; i <= arr.length -2; i++ ){
            for(int j = i+1 ; j > 0; j--){
                if(arr[j] < arr[j-1]){
                    //swap if before value is big
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else{
                    //this means before values are sorted and presenr elemnt is big than before
                    break;
                }
            }
        }
    }
}
