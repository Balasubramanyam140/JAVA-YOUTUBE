1) Ex : Write a function that prints hello world
2) Write a function that takes in a number nd prints it
   Print first 5 numbers: 1 2 3 4 5
3) Fibonacci series using recursion
4) Binary Search using Recursion

----------------------------------------------------------------------------------------
1) Ex : Write a function that prints hello world
        
        class Main{
            public static void main(String[] args){
                //write a function that prints hello world
                 message();
            }
            static void message(){
                    System.out.println("Hello");
                    message1();
            }
            static void message1(){
                    System.out.println("Hello");
                    message2();
            }
            static void message2(){
                    System.out.println("Hello");
                    message3();
            }
            static void message3(){
                    System.out.println("Hello");
                    message4();
            }
            static void message4(){
                    System.out.println("Hello");
            }
        }

OUTPUT :
          Hello
          Hello
          Hello
          Hello
          Hello
---------------------------------------------------------------------------------------
2) Write a function that takes in a number nd prints it
   Print first 5 numbers: 1 2 3 4 5


        
                class Main{
            public static void main(String[] args){
                //Write a function that takes in a number nd prints it
                //Print first 5 numbers: 1 2 3 4 5
                print1(1);
            }
            static void print1(int n){
                System.out.println(n);
                print2(2);
            }
            static void print2(int n){
                System.out.println(n);
                print3(3);
            }
            static void print3(int n){
                System.out.println(n);
                print4(4);
            }
            static void print4(int n){
                System.out.println(n);
                print5(5);
            }
            static void print5(int n){
                System.out.println(n);
            }
        }

OUTPUT:
        1
        2
        3
        4
        5

---------------------------------------------------------------------------------------
3) Fibonacci series using recursion


         class Main{
          public static void main(String[] args){
              System.out.println(fibo(7));
          }
          static int fibo(int n){
              if(n<2){
                  return n;
              }
             return fibo(n-1)+fibo(n-2);
          }
          
         }

OUTPUT :
         13
---------------------------------------------------------------------------------------
4) Binary Search using Recursion
   
                     class Main{
             public static void main(String[] args){
                 int[] arr={2,4,5,7,9,10,24,34,46,57,58,79};
                 int target = 24;
                 int result= binarySerach( arr, 0, arr.length -1, target);
                 if(result != -1){
                     System.out.println("Found");
                 }
                 else{
                     System.out.println("Not Found");
                 }
             }
             static int binarySerach(int[] arr,int s,int e,int target){
                 if(s <= e){
                     int mid = s + (e -s)/2;
                     
                     if(arr[mid] == target){
                         return mid;
                     }
                     if(arr[mid] > target){
                         return binarySerach(arr,s,mid-1,target);
                     }
                     return binarySerach(arr,mid+1,e,target);
                 }
                 return -1;
             }
         }
OUTPUT :
         Found
   
---------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------
