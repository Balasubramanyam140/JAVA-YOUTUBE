QUe : To search between range 

  
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
