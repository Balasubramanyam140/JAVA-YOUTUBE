1) Printing a characte from a string
2) Checking Upper or Lower Case


import java.util.Scanner;
class CaseCheck{
	public static void main(String[] args){
		String word = "Hello";
		System.out.println("word = Hello word.charAt(0) is " + word.charAt(2)); 
		//charAT(_) here it gives the value which is at that particular index
	}
}

/*
  OUTPUT:
        word = Hello word.charAt(0) is l
*/
_______________________________________________________________________________-
2)Checking Upper or Lower Case

	import java.util.Scanner;
	class Main{
	    public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Checking upper case or lower case ");
	        char ch = sc.next().trim().charAt(0);
	        if(ch >= 'a' && ch<='z')
	            System.out.println("ch = "+ ch + " is a Lower case ");
	        else
	        System.out.println("ch = "+ ch + " is a Uppercase case ");
	        
	    }
	}

OUTPUT :
        Checking upper case or lower case 
        H
        ch = H is a Upper case 
