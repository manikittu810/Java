@FunctionalInterface
interface A{
    void show(int i,int j );
}

public class lambdaExprEg1 {
    public static void main(String args[]) {
      A obj=(i,j) -> System.out.println("Hi show" +i + j);
      obj.show(2,5);
    }
}

//lambda expression 
