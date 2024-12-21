QUE : Searching missmatching value and the index
  
import java.util.Arrays;
// https://leetcode.com/problems/set-mismatch/
public class Main {
    public static void main(String[] args){
        int[] arr = {4,2,5,6,2,1,3}; //1 2 3 4 5 6 2
        int[] a = findErrorNums(arr);
        System.out.println(Arrays.toString(a));
    }
    public static int[] findErrorNums(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }

        // search for first missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return new int[] {arr[index], index+1};
            }
        }
        return new int[] {-1, -1};
    }
}

OUTPUT :
          [2, 7]
  ----------------------------------------------------------------------------------------------
