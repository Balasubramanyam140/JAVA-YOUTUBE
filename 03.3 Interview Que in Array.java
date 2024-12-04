------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------
//Reversing an Array using Swap method
//Two pointer method :By having two pointers
// Swaping values in an Array
import java.util.Scanner;
import java.util.Arrays;
class HelloWorld {
    public static void main(String[] args) {
        
        int[] arr = {1, 3, 23, 9 ,10};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr){
        int start =0;
        int end = arr.length -1;
        
        while(start < end){
            swap(arr , start, end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr, int index1, int index2){
        int temp  = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}

OUTPUT :
        [10, 9, 23, 3, 1]
------------------------------------------------------------------------------------------

// Swaping values in an Array
import java.util.Scanner;
import java.util.Arrays;
class HelloWorld {
    public static void main(String[] args) {
        
        int[] arr = {1, 3, 23, 9 ,10};
        swap(arr, 1, 3);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int index1, int index2){
        int temp  = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}

OUTPUT :
          [1, 9, 23, 3, 10]
------------------------------------------------------------------------------------------
//Max value of an Array

import java.util.Scanner;
import java.util.Arrays;
class HelloWorld {
    public static void main(String[] args) {
        int[] arr = { 2, 45, 143, 82, 10};
        
        System.out.println(maxRange(arr, 1, 3));
    }
    
    static int maxRange(int[] arr, int start, int end){
        int maxVal = arr[0];
        for(int i=1 ;i< arr.length; i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
    
}

OUTPUT :
            143
------------------------------------------------------------------------------------------
//Max Value between a two indexs

import java.util.Scanner;
import java.util.Arrays;
class HelloWorld {
    public static void main(String[] args) {
        int[] arr = { 1782, 45, 143, 82, 150};
        
        System.out.println(maxRange(arr, 1, 3));
    }
    
    static int maxRange(int[] arr, int start, int end){
        int maxVal = arr[start];
        for(int i=start ;i< end; i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
    
}

OUTPUT : 
            143
------------------------------------------------------------------------------------------
     
