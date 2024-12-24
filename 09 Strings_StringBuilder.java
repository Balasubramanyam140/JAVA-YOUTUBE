1) String Comparison using (==) and (.equals) methods




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
