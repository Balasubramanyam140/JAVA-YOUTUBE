1. Cresting 2D Array[]
2. Giving values for Array[] using Scanner()
3. Printing the 2D Array[]    

    
import java.util.*;
import java.io.*;
import java.lang.*;
class Main{
    public static void main(String[] args){
        /*
            1 2 3 
            4 5 6
            7 8 9
        */
        //2D is defining with 2 [][] brackets
        //giving values numbers of rows is mandatory [2][];
        
        //int[][] arr = new int[3][3];
      /*  
        int[][] arr = {
            {1,2,3},  //arr[0].      -0th index
            {4,5,6},   //arr[1]       - 1st index
            {7,8,9}     //arr[2]      - 2nd index  -> arr[2] = {7,8,9}
        };     
        
        */
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[4][3];
        System.out.println(arr.length); //no of rows
        //input
        for(int row = 0 ; row < arr.length; row++){
            for(int col =0 ; col < arr[row].length ; col++ ){
                arr[row][col] = sc.nextInt();
            }
        }
        /*
        //Output
        for(int row = 0 ; row < arr.length; row++){
            for(int col =0 ; col < arr[row].length ; col++ ){
                System.out.print(arr[row][col] +" ");
            }
            System.out.println();
        }
        */
        /*
        //OUTPUT 2nd Method
        for(int row=0 ; row <= arr.length ; row++){
            System.out.println(Arrays.toString(arr[row]));
        }
        */
        
        //OUTPUT 3rd method
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
OUTPUT :
                4 
                1 2 3 4 5 6 7 8 9 0 9 8 
                [1, 2, 3]
                [4, 5, 6]
                [7, 8, 9]
                [0, 9, 8]
--------------------------------------------------------------------------------------------------------------------------------
class Main{
    public static void main(String[] args){
        int[][] arr = {{1, 2, 3, 4},
        {5, 6},
        {7, 8, 9}
    };
    for(int row = 0; row<arr.length ; row++){
        for(int col =0; col<arr[row].length; col++){
            System.out.println(arr[row][col]+" ");
        }
        System.out.println();
    }
}
}

OUTPUT:
        1 2 3 4
        5 6 
        7 8 9    
