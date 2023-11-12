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
        0
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
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
        null
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
