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
