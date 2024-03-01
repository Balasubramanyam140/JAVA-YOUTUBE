Que : Search an element using binary Search from a sorted array

class BinarySearch{
    public static void main(String[] args){
        int [] arr = { 2, 3, 5, 18, 17, 23, 48, 59, 60};
        int target = 17;
        int ans = binarySearch(arr, target);
        
        System.out.println(ans);
    }
    //return the index
    //return -1 if it doesnt exist
    static int binarySearch(int[] arr, int target){
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
        return -1;
    }
}

OUTPUT :
          4
________________________________________________________________________________________________________________________
