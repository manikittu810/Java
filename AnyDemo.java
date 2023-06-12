class A{
    public A(){
        System.out.println("Object created ,Ths is a constructor");
    }
    public void show(){
        System.out.println("in A show");
    }
}
    public class AnyDemo{
        public static void main(String args[]){
           new A();//anonymous object
        }
    }
