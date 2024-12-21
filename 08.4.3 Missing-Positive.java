QUE : THe first Missing number 


import java.util.Arrays;
// https://leetcode.com/problems/set-mismatch/
public class Main {
    public static void main(String[] args){
        int[] arr = {4,2,5,6,2,1,3}; //1 2 -1 4 5 6 2
        int a = firstMissingPositive(arr);
        System.out.println(a);
    }
    public static int firstMissingPositive(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = arr[i];
            } else {
                i++;
            }
        }

        // search for first missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return index + 1;
            }
        }

        // case 2
        return arr.length + 1;
    }
}

OUTPUT :
        3
--------------------------------------------------------------------------------------------------
  
