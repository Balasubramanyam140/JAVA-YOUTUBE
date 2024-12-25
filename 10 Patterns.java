1)  *****
    *****
    *****
    *****
    *****

2)  
      *
      **
      ***
      ****
      *****

3)
  
        *****
        ****
        ***
        **
        *

4)
         1 
         1 2 
         1 2 3 
         1 2 3 4 
         1 2 3 4 5 

5)
         1 2 3 4 5 
         1 2 3 4 
         1 2 3 
         1 2 
         1 
  ------------------------------------------------------------------------------------------------
  1)    *****
        *****
        *****
        *****
        *****

  
          import java.util.Scanner;
          class Main{
              public static void main(String[] args){
                  int n = 5;
                  for(int i=0;i<n;i++){
                      for(int j=1;j<=n;j++){
                          System.out.print("*");
                      }
                      System.out.println();
                  }
              }
          }

  ------------------------------------------------------------------------------------------------
  2)        *
            **
            ***
            ****
            *****

            class Main{
                public static void main(String[] args){
                    int n = 5;
                    pattern(n);
                }
                
                static void pattern(int n){
                    for(int row=0;row < n;row++){
                        for(int col=0; col<=row;col++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                }
            }

                   (or)

          class Main{
          public static void main(String[] args){
              int n = 5;
              for(int i=n;i>0;i--){
                  for(int j=i;j<=n;j++){
                      System.out.print("*");
                  }
                  System.out.println();
              }
          }
      
  ------------------------------------------------------------------------------------------------
  3)
        *****
        ****
        ***
        **
        *

          class Main{
          public static void main(String[] args){
              int n = 5;
              for(int i=0;i<n;i++){
                  for(int j=i;j<=n;j++){
                      System.out.print("*");
                  }
                  System.out.println();
              }
          }
      }
  ------------------------------------------------------------------------------------------------
4)
         1 
         1 2 
         1 2 3 
         1 2 3 4 
         1 2 3 4 5 
      
         class Main{
          public static void main(String[] args){
              int n = 5;
              for(int i=1;i<=n;i++){
                  for(int j=1; j<=i; j++){
                      System.out.print(j+" ");
                  }
                  System.out.println();
              }
          }
      }

  ------------------------------------------------------------------------------------------------
5)
         1 2 3 4 5 
         1 2 3 4 
         1 2 3 
         1 2 
         1 
     
         class Main{
             public static void main(String[] args){
                 int n = 5;
                 for(int i=n;i>=0;i--){
                     for(int j=1; j<=i; j++){
                         System.out.print(j+" ");
                     }
                     System.out.println();
                 }
             }
         }

  ------------------------------------------------------------------------------------------------

  ------------------------------------------------------------------------------------------------
  ------------------------------------------------------------------------------------------------
  ------------------------------------------------------------------------------------------------
  ------------------------------------------------------------------------------------------------
