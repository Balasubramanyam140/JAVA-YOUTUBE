class OrderAgnosticBS{
    public static void main(String[] args){
       // int[] arr = {-18, -12, -4, 0 , 2, 32, 45, 65, 78, 98 ,100};
        int [] arr = { 90, 89, 78, 67, 59, 48, 38, 32, 29, 20, 10};
        int target = 32;
        
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }
    static int orderAgnosticBS(int [] arr, int target){
        int start =0;
        int end = arr.length -1;
        
        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];
        
         while(start <= end){
            //find the middle element
            //int mid = (start + end)/2;
            //might be possible that (start + end)  exceeds the range of int in java
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            
            if(isAsc){
                if(target < arr[mid]){
                    end = mid -1;
                }
                //(target > arr[mid])
                else {
                    start = mid + 1;
                }
            }
            else{
                if (target > arr[mid]){
                     end = mid-1;
                }
                //(target < arr[mid])
                else {
                    start = mid+1;
                }
            }
            
        }
        return -1;
    }
}

OUTPUT:
        7
