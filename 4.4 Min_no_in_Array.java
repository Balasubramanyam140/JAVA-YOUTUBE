Que : Min no from Array

class FindMin{
    public static void main(String[] args){
        int [] arr = { 18 , -7 , 56 , 72 , 62};
        System.out.println("Min number is " + min(arr));
    }
    
    static int min(int[] array){
        int min = array[0];
        for(int i=0;i < array.length;i++){
            if(array[i]<min)
                min = array[i];
        }
        return min;
    }
}

OUTPUT :
          -7
