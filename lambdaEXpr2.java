@FunctionalInterface
interface A{
    int  add(int i,int j );
}

public class lambdaEXpr2 {
    public static void main(String args[]) {
      A obj=(i,j) ->i+j;
     int res= obj.add(2,5);
      System.out.println(res);
    }
}

//lambda expression 
