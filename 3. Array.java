1 . Creating the Array 
2. giving values using
    for(int i=0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
2. Printing using 
            for(int i=0; i < arr.length; i++){
                    
                    System.out.print(arr[i]+ " ");
                }

                or

            for(int num : arr){// for every element in array , print the element
            System.out.print(num + " "); //here num represents elements of the array
        }


                or

            System.out.println(Arrays.toString(arr));



import java.lang.*;
import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args){
        int[] arr = new  int[5];
        arr[0] = 23;
        arr[1] = 56;
        arr[2] = 98;
        arr[3] = 64;
        arr[4] = 73;
        //[23, 56, 98, 64, 73]
        Scanner sc = new Scanner(System.in);
        System.out.println(arr[3]);
        for(int i=0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
    /*
        for(int i=0; i < arr.length; i++){
            
            System.out.print(arr[i]+ " ");
        }
      */  
    /*
            System.out.println(Arrays.toString(arr));
    */
        for(int num : arr){// for every element in array , print the element
            System.out.print(num + " "); //here num represents elements of the array
        }
    }
}

OUTPUT : 
    64
    1
    2
    3
    4
    5
    1 2 3 4 5 
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
1. Direct printing the array using Arrays.toString(arr) Method :
import java.util.*;
import java.io.*;
import java.lang.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Array of objects
        String[] str = new String[4];
        for(int i=0;i < str.length; i++){
            str[i] = sc.next();
        }
        System.out.println(Arrays.toString(str));
    }
}

OUTPUT :
                
                a
                b
                c
                d
                [a, b, c, d]

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
1. Direct printing the array using Arrays.toString(arr) Method :
import java.lang.*;
import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args){
        int[] arr = new  int[5];
        arr[0] = 23;
        arr[1] = 56;
        arr[2] = 98;
        arr[3] = 64;
        arr[4] = 73;
        //[23, 56, 98, 64, 73]
        System.out.println(Arrays.toString(arr));
    }
}

OUTPUT :
        [23, 56, 98, 64, 73]
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
1. Creating an Array
2. Giving the values using Scanner
3. Printing the Array 

    
import java.io.*;
import java.util.*;
import java.lang.*;
public class Main{
    public static void main(String[] args){
        /*
        int[] ros; //declaration of array. ros is getting defined in the stack
        ros = new int[s]; //intialisation: actually here object is being created in heap
        
        
        */
        //Syntax for direct giving
        //dataType[] variableName = { Value1, value2, value3};
        //Store 5 roll nos :
        int[] rnos = {23,12, 45, 32, 15};
        for(int i=0;i<rnos.length;i++){
            System.out.print(rnos[i] + " ");
        }
        System.out.println();
        
        //Syntax 
        //datatype[] variableName = new datatype[size];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
1. Printing the an individual item from an array

    
import java.lang.*;
import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args){
        int[] ros;
        ros = new int[5];
        //interally it will be like [0,0,0,0,0] so it gives zero when we print
        System.out.println(ros[1]);
    }
}

OUTPUT :
        0  // in int if there is no value it gives 0 
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
1. Printing an individual from the String

    
import java.lang.*;
import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args){
        String[] arr = new String[4];
        
        System.out.println(arr[0]);
    }
}

OUTPUT :
        null   //in String if there is no value it gives null
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
1. Modify using function 
    
import java.util.*;
import java.io.*;
import java.lang.*;
class Main{
    public static void main(String[] args){
        
        int[] nums = {3,4,5,12};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
        
    }
    static void change(int[] arr){
        arr[0] = 99;
    }
}

OUTPUT :

                [3, 4, 5, 12][99, 4, 5, 12]
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
