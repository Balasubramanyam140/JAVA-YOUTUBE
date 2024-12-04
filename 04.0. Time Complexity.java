
Linear Search
--------------- 
    Time complexity : O(1) //constant
    worst case  : O(N) //N -> Size of Array

  
1)  Best Case :
    ----------
    How many checks will the loop make in Best Case i.e., element found at 0th Index 
                arr = [8,38,92,67,98,65,45,908,578];
                target = 8;
                only 1 comparison takes place bec it was at 0th index so Best Case
                
                
                arr = [ 18 , 12, 87, 67 , 86, .......... 1lak items ]
                target = 18 -> only 1 comparison Best Case
                
    * In Best Case its not depending on the size of the Array .
    * In Best Case the items should found at 0th Index.
    
               Time /\
                    \
                    \         O(1)
                    \
                    \____________________________
                    \
                    \____\_____\______\_________>
                        100.  200.   500.      size
        
                        Best Case


 2)   Worst Case :
      ----------
    When you donot find the Target in the Array .
    Iterate / go through every item and then its say i didn't find it
    
    size of array = 100. -> 100 comparisons
                    200  -> 200 comparisons
                    1lak  -> 1 lak comparsions
                    
          Time(ms) /\    
                    \       /
                    \      /       O(N)
                200 \_____/
                    \   /  \
                100 \ _/   \
                    \/_\___\_______>
                       100 200.     size
                       
                      Worst Case    
