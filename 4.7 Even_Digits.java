/*Given an array nums of integers, return how many of them contain an even number of digits.

Example 1:

Input: nums = [12,345,2,6,7896]
Output: 2
Explanation: 
12 contains 2 digits (even number of digits). 
345 contains 3 digits (odd number of digits). 
2 contains 1 digit (odd number of digits). 
6 contains 1 digit (odd number of digits). 
7896 contains 4 digits (even number of digits). 
Therefore only 12 and 7896 contain an even number of digits.
*/
class EvenDigits{
    public static void main(String[]args){
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] nums){
        int count = 0;
        for(int num : nums){
            if( even(num)){
                count++;
            }
        }
            return count;
        
    }
        //function to chek whether a number contains even digits or not
        static boolean even(int num){
            int numberOfDigits = digits(num);
            /*
            if(numberOfDigits %2 ==0){
                return true;
            }
            return false;
            */
            return numberOfDigits %2 ==0;
        }
        static int digits(int num){
            if(num < 0 ){
                  num = num * -1;
            }
            if(num ==0){
                return 1;
            }
          
            int count =0;
            while(num>0){
                count++;
                num = num / 10;
            }
            return count;
        }
}

OUTPUT :
          2
____________________________________________________________________________________________________
