Cyclic Sort is an efficient algorithm used to sort a collection of number
  when the numbers are in the range of 1 to n. This algorithm works in O(n) 
  time complexity with  O(1) extra space. 
  It's especially useful when dealing with problems like finding missing numbers, 
  duplicates, or reordering an array.


  
import java.util.Arrays;
class Main{
    public static void main(String[] args){
        int[] arr = { 3, 5, 2, 1, 4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    static void sort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                int temp = arr[correct];
                arr[correct] = arr[i];
                arr[i] = temp;
            }
            else{
                i++;
            }
        }
    }
}


OUTPUT:
        [1, 2, 3, 4, 5]
------------------------------------------------------------------------------------------
