class A{
    public void show(){
        System.out.println("show A");
    }
    }
class B extends A{
    public void show(){
        System.out.println("show B");
    }
    }

public class anonymousClass{
    public static void main(String args[]){
A obj=new A()
{//anonymous  class
    public void show(){
        System.out.println("new show A");
    }
};
obj.show();


}
} 

