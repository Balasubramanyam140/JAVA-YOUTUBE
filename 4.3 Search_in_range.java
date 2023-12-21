Que : To search between range 

  class SearchInRange{
    public static void main(String[] args){
        int[] arr = { 10, 12, -7 ,3 ,14 , 28 };
        int target = 14;
        System.out.println(linearSearch(arr , target, 1, 4));
    }
    
    static int linearSearch(int[] arr, int target, int start, int end){
        if(arr.length == 0 )
            return -1;
        
        for(int i= start ; i <= end ; i++){
            int element = arr[i];
            if(element == target)
                return i;
        }
        return -1;
    }
}
OUTPUT :
          4
 --------------------------------------------------------------------------------------------------------------
Que : To search between range 

class SearchRange{
    public static void main(String[] args){
        int[] arr = { 40 , -2 , 30, 15 , 19 };
        
        int target = 2;
        System.out.println(Search(arr , target));
    }
    
    static boolean Search(int[] array , int target){
        for( int i = 1; i< 3 ; i++){
            if(array[i] == target)
                return true;
        }
        return false;
    }
}

OUTPUT :
          false
--------------------------------------------------------------------------------------------------------------
