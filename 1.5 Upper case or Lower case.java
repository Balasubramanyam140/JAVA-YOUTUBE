import java.util.Scanner;
class CaseCheck{
	public static void main(String[] args){
		String word = "Hello";
		System.out.println("word = Hello word.charAt(0) is " + word.charAt(2)); //charAT(_) here it gives the value which is at that particular index
		Scanner sc = new Scanner(System.in);
		System.out.println("Checking upper case or lower case ");
		char ch = sc.next().trim().charAt(0); /* trim means removes the extra space like (    hello   ) it gives (hello) */
		if(ch >= 'a' && ch <= 'z' )
		    System.out.println("ch = " + ch + " is a Lower case ");
		else
		    System.out.println("ch = " + ch + " is a Upper case ");
		
	}
}

/*
  OUTPUT:
        word = Hello word.charAt(0) is l
        Checking upper case or lower case 
        H
        ch = H is a Upper case 
*/
