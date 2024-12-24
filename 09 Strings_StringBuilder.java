1) String Comparison using (==) and (.equals) methods
2) Formatting Specifiers



-----------------------------------------------------------------------------
  
1) String Comparison using (==) and (.equals) methods

          class Main{
                public static void main(String[] args){
                    String a = "Balu";
                    String b = "Balu";
                    System.out.println(a == b);
                    
                    String c = new String("Subramanyam");
                    String d = new String("Subramanyam");
                    System.out.println(c == d);
                    System.out.println(a == d);
                    System.out.println(c.equals(d));
                }
            }


OUTPUT :
            true
            false
            false
            true
  -----------------------------------------------------------------------------
2) Formatting Specifiers


        class Main{
            public static void main(String[] args){
                System.out.println(Math.PI);
                System.out.printf("Pie : %.3f",Math.PI);
                System.out.println();
                float a = 453.236488f;
                System.out.printf("Formatted number is %.2f",a);
                System.out.println();
                System.out.printf("Hello My name is %s and I am %s","Balu", "cool");
            }
        }

OUTPUT :
          3.141592653589793
          Pie : 3.142
          Formatted number is 453.24
          Hello My name is Balu and I am cool
  -----------------------------------------------------------------------------





