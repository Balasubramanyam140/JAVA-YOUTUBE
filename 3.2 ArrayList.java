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
