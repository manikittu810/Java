interface A{

int age=23;
String name = " smk";
    void show();
    void config();
    }
interface x
{
    void run();
}
interface y extends x{
    void run();
}
class B implements A,y{
    public void show(){
        System.out.println("show B");
    }
    public void config(){
        System.out.println("show config");
    }
    public void run(){
        System.out.println("show run");
    }
}
    public class interfaceImplementation{
    public static void main(String args[]){
A obj=new B();
obj.show();
obj.config();

x obj1= new B();
obj1.run();

    }
}
// we can  use anonymous inner class for abstract class as well

//interface implmentation
