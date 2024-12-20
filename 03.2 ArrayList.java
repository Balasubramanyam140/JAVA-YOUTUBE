//When we dontknow how much size we want 
//hey java  handle  size for me . let me give input any no of input i want
import java.util.ArrayList;
class Main{
    public static void main(String[] args){
        /*Syntax
        ArrayList<Integer> list = new ArrayList<Integer>();
        */
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(67);
        list.add(209);
        list.add(87);
        list.add(23);
        list.add(45);
        list.add(87);
        list.add(87);
        list.add(34);
        list.add(55);
        list.add(67);
        list.add(76);
        list.add(87);
        list.add(87);
        list.add(34);
        list.add(55);
        list.add(67);
        list.add(76);
        list.add(34);
        list.add(89);
        System.out.println(list);
    }
}

OUTPUT :
        [67, 209, 87, 23, 45, 87, 87, 34, 55, 67, 76, 87, 87, 34, 55, 67, 76, 34, 89]
-------------------------------------------------------------------------------------------
//When we dontknow how much size we want 
//hey java  handle  size for me . let me give input any no of input i want
// list.remove(index no);    to remove the index completely
// list.set(index , updated value);   to update a particular index
import java.util.ArrayList;
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        /*Syntax
        ArrayList<Integer> list = new ArrayList<Integer>();
        */
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
       
        list.add(67);
        list.add(209);
        list.add(87);
        list.add(23);
        list.add(45);
        list.add(87);
        
        System.out.println(list);
        
        System.out.println("Chechking for the value is present or not");
        System.out.println(list.contains(67));
        //for Updation
        System.out.println("Updated Index");
        list.set(0, 99);
        System.out.println(list);
        //to remove
        System.out.println("Removed Index");
        list.remove(2);
        System.out.println(list);
    }
}

OUTPUT :
            [67, 209, 87, 23, 45, 87]
            Chechking for the value is present or not
            true
            Updated Index
            [99, 209, 87, 23, 45, 87]
            Removed Index
            [99, 209, 23, 45, 87]
----------------------------------------------------------------------------------------
// list.add - to add items in list 
// list.get(i)  - to get a particular index
    
import java.util.ArrayList;
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        /*Syntax
        ArrayList<Integer> list = new ArrayList<Integer>();
        */
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
       
        //input
        for(int i=0;i<5;i++){
            list.add(sc.nextInt());
        }
        //Get item at any index
        for(int i=0;i<5;i++){
            System.out.print(list.get(i) + " ");
        }
        /* or
        System.out.println(list);
        */
    }
}

OUTPUt :
        1 2 3 4 5
        1 2 3 4 5
---------------------------------------------------------------------------------------------------
//Multi dimentional ArrayList is also Possible
import java.util.Scanner;
import java.util.ArrayList;
class HelloWorld {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        
        //Intialization
        for(int i=0;i<3;i++){
            list.add(new ArrayList<>());
        }
        //Add elements
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list);
    }
}
INPUT :
            1 2 3 4 5 6 7 8 9
    
OUTPUT :
            [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
-------------------------------------------------------------------------------------------
//Que : Ascending Order and Discending Order

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       for(int i=0;i<n; i++){
           list.add(sc.nextInt());
       }
       System.out.println("Our List : ");
       System.out.println(list);
        //to print particular value
        System.out.println("List size : "+ list.size());
        System.out.println("Ascending order");
        Collections.sort(list);
        System.out.println(list);
        //adding a new value to particular position
        
        System.out.println("Descending order");
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}

INPUT :
        6
        3
        4
        3
        43
        4
        3
OUTPUT :
        Our List : 
        [3, 4, 3, 43, 4, 3]
        List size : 6
        Ascending order
        [3, 3, 3, 4, 4, 43]
        Descending order
        43 4 4 3 3 3 
----------------------------------------------------------------------------------------------------------------
        
        
