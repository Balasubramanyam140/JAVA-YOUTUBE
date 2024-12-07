Que : Sorting in Bubble Sort 
Bubble Sort Steps:
Initial Array: [5, 3, 4, 1, 2]
Pass 1:
Compare and swap adjacent elements:
[5, 3, 4, 1, 2] → [3, 5, 4, 1, 2] → [3, 4, 5, 1, 2] → [3, 4, 1, 5, 2] → [3, 4, 1, 2, 5]
Pass 2:
[3, 4, 1, 2, 5] → [3, 4, 1, 2, 5] → [3, 1, 4, 2, 5] → [3, 1, 2, 4, 5]
Pass 3:
[3, 1, 2, 4, 5] → [1, 3, 2, 4, 5] → [1, 2, 3, 4, 5]
Pass 4:
[1, 2, 3, 4, 5] (No swaps; array is sorted)
Final sorted array: [1, 2, 3, 4, 5].








import java.util.Arrays;
class BubbleSort{
    public static void main(String[] args){
        int[] arr = {5,4,3,2,3,1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    static void bubble(int[] arr){
        boolean swapped;
        //run the steps n-1 RuntimePermission
        for(int i=0;i<arr.length;i++){
            swapped = false;
            //for each step, max item will come at the last respective Index
            //so i is kept here and dont need to go to till last everytime
            for(int j=1;j<arr.length - i;j++){
                //swap if the item is smaller than the previous item
                if(arr[j] < arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            //if you did not swap for a partiular value of i, 
            //it means the array is sorted hence stop the program
            if(!swapped){ //!false = true
                break;
            }
        }
    }
}


Output : [1, 2, 3, 3, 4, 5]
-------------------------------------------------------------------------------------------------
