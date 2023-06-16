abstract class A{

    public abstract void show();
      public abstract void config();
    }


public class AnonymouInnerClass{
    public static void main(String args[]){
A obj=new A(){
    public void show(){
        System.out.println("show B");
    }
    public void config(){
        System.out.println("show config");
    }
};
obj.show();
obj.config();

    }
}
// we can use anonymous inner class for abstract class as well
