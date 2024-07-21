QUE : Floor of the target
class BinarySearch{
    public static void main(String[] args){
        int [] arr = { 2, 3, 5, 17, 18, 23, 48, 59, 60};
        int target = 15;
        int ans = floor(arr, target);
        
        System.out.println(ans);
    }
    //return the index
    // return the index : greatest number <= target
    static int floor(int[] arr, int target){
       if(target > arr[arr.length-1]){
            return -1;
        }
       
        int start = 0;
        int end = arr.length -1;
        while(start <= end){
            //find the middle element
            //int mid = (start + end)/2;
            //might be possible that (start + end)  exceeds the range of int in java
            int mid = start + (end - start)/2;
            if (target < arr[mid]){
                end = mid-1;
            }
            else if(target > arr[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return end;
    }
}

OUTPUT :
          2
