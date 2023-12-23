QUE : Max value in 2D Array

import java.util.Arrays;
class SearchIn2DArray{
    public static void main(String[] args){
        int[][] arr = {
            {22, 34, 12},
            {19, 76, 56},
            {65, 79, 90},
            {18, 12, 43}
        };
        System.out.println(Integer.MIN_VALUE);
        System.out.println(max(arr));
    }
    static int max(int[][] array ){
        int max = Integer.MIN_VALUE;  //array[0][0];
        for(int row=0;row < array.length; row++){
            for(int col =0 ; col < array[row].length; col++){
                if( array[row][col] > max){
                    max =  array[row][col]  ;
                    
                }
            }
        }
        return max;
    }
}

OUTPUT:
        -2147483648
        90
