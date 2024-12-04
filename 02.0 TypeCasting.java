import java.util.Scanner;
public class TypeCasting{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // float num = sc.nextFloat();
        // System.out.println(num);
        
        //int num = 56.54; This gives an Error int to direct float cannot be done
         //Type CASTING is done
         System.out.println("Converting float to int");
        int num = (int)(143.50f);
        System.out.println(num);
        //automatic type promotion in expressions
        int a = 257;
        System.out.println("Printing byte value of a = 257 is ");
        byte a1 = (byte)a;  //byte = 256
        System.out.println(a1); 
        // here it prints 1 bec max value of byte is 256 so it divides by 256 and gives the remainder as output 257%256=1
        byte b = 40;
        byte c =50;
        byte d = 100;
        int e = b * c / d;
        System.out.println("byte operation and then converting to int " + e);
        //byte n = 5;
        // n = n+ 2; this wont work bec here n is byte and 2 is an int we cant add directly
        
        int f = 'a';
        int g = 'A';
        //int and giving character value this gives us  ascii value of that character
        System.out.println("int and giving character a = "+f+" and A ="+g);
        System.out.println("3 * 5.6 = " + 3 * 5.6 );
        //int + float  = float value these are promotion rules
        byte b1 = 42;
        char b2 = 'a';
        short b3 = 1024;
        int b4 = 50000;
        float b5 = 5.67f;
        double b6 = 0.1234;
        double result = ( b1 + b2 ) * (b3/ b4) - ( b5 - b6);
        System.out.println(( b1 + b2 ) + " * " +(b3/ b4) + "-"+ ( b5 - b6)+ " = " + result);
    }
}
/*
Converting float to int
143
Printing byte value of a = 257 is 
1
byte operation and then converting to int 20
int and giving character a = 97 and A =65
3 * 5.6 = 16.799999999999997139 * 0-5.546600076293945 = -5.546600076293945

*/
