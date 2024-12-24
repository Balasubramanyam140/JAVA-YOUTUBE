1) String Comparison using (==) and (.equals) methods
2) Formatting Specifiers
3) String Comcatenations
4) Printing a - z


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
3) String Comcatenations

          import java.util.ArrayList;
          class Main{
              public static void main(String[] args){
                  System.out.println('a' + 'b');
                  System.out.println("a"+"b"); 
                  System.out.println('a' + 3 ); // ascii of a = 97
                  System.out.println((char)('a' + 3)); 
                  System.out.println("Balu" + new ArrayList<>());
                  System.out.println("Balu" + new Integer(56));
                  String ans =new Integer(56) + "" + new ArrayList<>();
                  System.out.println(ans);
              }
          }

  OUTPUT :
              195
              ab
              100
              d
              Balu[]
              Balu56
              56[]

  -----------------------------------------------------------------------------
4) Printing a - z
            
            class Main{
                public static void main(String[] args){
                    String series= "";
                    for(int i=0;i<26;i++){
                        char ch = (char)('a'+i);
                        System.out.print(ch+" ");
                    }
                }
            }
//Here it creates 26 objects and time complexity is 0(N^2)
//a ab abc abcd .......     abcd--z

                      (or)
                        
            class Main{
                    public static void main(String[] args){
                        String series= "";
                        for(int i=0;i<26;i++){
                            char ch = (char)('a'+i);
                            series = series + ch+ " ";
                        }
                        System.out.println(series);
                    }
                }
OUTPUT :
          a b c d e f g h i j k l m n o p q r s t u v w x y z 
  -----------------------------------------------------------------------------


