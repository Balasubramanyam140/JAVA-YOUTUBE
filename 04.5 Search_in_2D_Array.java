QUE : Searrching the position of the element in the 2D array
import java.util.Arrays;
class SearchIn2DArray{
    public static void main(String[] args){
        int[][] arr = {
            {22, 34, 12},
            {19, 76, 56},
            {65, 79, 90},
            {18, 12, 43}
        };
        int target = 34;
        int[] ans = search(arr,target); // format of. return value {row, col]
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] array , int target){
        for(int row=0;row < array.length; row++){
            for(int col =0 ; col < array[row].length; col++){
                if( array[row][col] == target){
                    return new int[]{row,col};
                          // we wrote new int[] bec to intialize 
                }
            }
        }
        return new int[]{-1, -1}; 
    }
}

OUTPUT :
        [0, 1]
