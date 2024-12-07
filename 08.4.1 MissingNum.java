//Missing number  between range ( 1 to n)

import java.util.Arrays;
class Main{
    public static void main(String[] args){
        int[] arr = { 3, 5, 0, 1, 4};
        
        System.out.println(missingNum(arr));
    }
    
    
    static int missingNum(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] ;
            if(arr[i] < arr.length && arr[i] != arr[correct]){
                int temp = arr[correct];
                arr[correct] = arr[i];
                arr[i] = temp;
            }
            else{
                i++;
            }
        }
        
        for(int index =0; index < arr.length; index++){
            if(arr[index] != index){
                return index;
            }
        }
        return arr.length;
    }
}

OUTPUT :
        2
