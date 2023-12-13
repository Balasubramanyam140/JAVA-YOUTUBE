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
