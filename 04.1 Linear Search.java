Que : Searching for the target using linear Search 

 
class Main {
    public static void main(String[] args) {
        int[] nums = { 23, 45 ,28 , 17 , 28 , 30 , 19 , 26 };
        int target = 19;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }
    //Search in the array : return the index if item found
    // otherwise if item not found return -1
    static int linearSearch(int[] arr , int target){
        if(arr.length == 0)
            return -1;
        
        // run a for loop
        for(int i=0; i < arr.length ; i++){
            //check for element at every index if it is = target 
            int element = arr[i] ;
            if(element == target){
                return i;
            }
            }
        return -1;
            //this line will execute if none of the return statemenets above have executed
            // hence the target not found
}
    // SEarch the target and return the element
    static int linearSearch2(int[] arr , int target){
        if(arr.length == 0)
            return -1;
        
        // run a for loop
        for(int i=0; i < arr.length ; i++){
            //check for element at every index if it is = target 
            int element = arr[i] ;
            if(element == target){
                return element ;
            }
            }
        return -1;
            //this line will execute if none of the return statemenets above have executed
            // hence the target not found
}
    // Search the target and return true or false
    static boolean linearSearch3(int[] arr , int target){
        if(arr.length == 0)
            return false;
        
        // run a for loop
        for(int i=0; i < arr.length ; i++){
            //check for element at every index if it is = target 
            int element = arr[i] ;
            if(element == target){
                return true ;
            }
            }
        return false;
            //this line will execute if none of the return statemenets above have executed
            // hence the target not found
}
OUTPUT :
          6
