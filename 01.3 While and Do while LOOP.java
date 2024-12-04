import java.util.Scanner;
class Main{
    public static void main(String [] args){
        //While loop
        /*
        Syntax :
            while (condition ) {
                //body
            }
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Using while condition");
        System.out.println("Enter value of n = ");
        int n = sc.nextInt();
        int num = 1;
        while( num != n){
            System.out.println(num);
               num++;
        }
        
        // Do while 
        //in this here it first do and then go to while condition
        // so atleast once it will done if while condition is false
        /*
        do{
           //body
        } while(condition);
        */
        System.out.println("Using Do While Condition");
        int n1 = 1;
        System.out.println("Enter value of a :");
        int a = sc.nextInt();
        
        do{
            System.out.println(n1);
            n1++;
        }
        while(n1 <= a);
    }
}

/*
              Using while condition
              Enter value of n = 
              5
              1
              2
              3
              4
              Using Do While Condition
              Enter value of a :
              6
              1
              2
              3
              4
              5
              6
*/
