1) Adding elements using StringBuilder
     or
  -> Printing alphabets
  -> DEleting a character from a string using StringBuilder


class Main{
    public static void main(String[] args){
        StringBuilder builder = new StringBuilder();
        for(int i=0;i<26;i++){
            char ch = (char)('a' + i);
            builder.append(ch);
        }
        System.out.println(builder);
        builder.deleteCharAt(0);
        System.out.println(builder);
    }
}

OUTPUT :
          abcdefghijklmnopqrstuvwxyz
          bcdefghijklmnopqrstuvwxyz

-------------------------------------------------------------------------------------------------------
