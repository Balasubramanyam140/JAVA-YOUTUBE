1) Palindrome in a string

              import java.util.Scanner;
              class Main{
                public static void main(String[] args){
                    Scanner sc = new Scanner(System.in);
                    String str = sc.next();
                    System.out.println(isPalindrome(str));
                }
                static boolean isPalindrome(String str){
                    if(str.length() ==0 || str == null){
                        return true; 
                    }
                    str = str.toLowerCase();
                    for(int i=0;i<str.length()/2; i++){
                        char start = str.charAt(i);
                        char end = str.charAt(str.length() -1 -i);
                        if(start != end){
                            return false;
                        }
                    }
                    return true;
                }
            }

Input :
          hjjh
OUTPUT :
          true
  ----------------------------------------------------------------------------------
