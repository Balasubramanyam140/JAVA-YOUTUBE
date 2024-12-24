1) String Methods 
              
              import java.util.Arrays;
              class Main{
                  public static void main(String[] args){
                      String name = "Bonu Balasubramanyam";
                      System.out.println(name.charAt(0));
                      System.out.println(Arrays.toString(name.toCharArray()));
                      //this .toUpperCase create a new object and doesnt affect orginal value
                      System.out.println(name.toUpperCase());
                      System.out.println(name);
                      System.out.println(name.indexOf('a'));
                      System.out.println("    Balu  ".strip());
                      System.out.println(Arrays.toString(name.split(" ")));
                  }
              }

OUTPUT :
            B
            [B, o, n, u,  , B, a, l, a, s, u, b, r, a, m, a, n, y, a, m]
            BONU BALASUBRAMANYAM
            Bonu Balasubramanyam
            6
            Balu
            [Bonu, Balasubramanyam]
  ----------------------------------------------------------------------------------------------
