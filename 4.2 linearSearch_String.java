Que : Search a character from the word using linear Search
  
import java.util.Arrays;
public class SearchInStrings {
    public static void main(String[] args){
        String name = "Balasubramanyam";
        char target = 'b';
        System.out.println(search(name, target));
    }
    static boolean search( String str , char target){
        if(str.length() == 0)
            return false; 
        
        for(int i=0; i< str.length(); i++){ 
            if(target == str.charAt(i)){ 
                return true; 
            } 
        } 
        return false; 
    } 
} 

output :
        true
--------------------------------------------------------------------------------------------------------------------------------------
QUE :
    [B, a, l, a, s, u, b, r, a, m, a, n, y, a, m] -  Arrays.toString(name.toCharArray())
    1) to check character present in word or not using for loop and for each loop

import java.util.Arrays;
public class SearchInStrings {
    public static void main(String[] args){
        String name = "Balasubramanyam";
        char target = 'b';
        System.out.println(search(name, target));
        System.out.println(Arrays.toString(name.toCharArray()));
    }
    
    static boolean search( String str , char target){
        if(str.length() == 0)
            return false; 
        
        for(int i=0; i< str.length(); i++){
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
    
    static boolean search2(String str , char target){
        if(str.length() == 0)
            return false;
        for(char ch : str.toCharArray()){
            if(ch == target)
                return true;
        }
        return false;
    }
    
}

OUTPUT :
          true
          [B, a, l, a, s, u, b, r, a, m, a, n, y, a, m]
