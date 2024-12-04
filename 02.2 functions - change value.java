import java.util.Scanner;
import java.util.Arrays;
class Main{
    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);
        //create an Array
        int[] arr = {1,2,3,4,5};
        change(arr);
        System.out.println(Arrays.toString(arr));
        
}
static void change(int[] num){
    num[0] = 99;//if you make a change to object via this ref variable,then same object will be changed
}
}

/*
OUTPUT :
        [99, 2, 3, 4, 5]
*/
