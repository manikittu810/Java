class A{
    public void show(){
        System.out.println("In A  Show");
    }
}
class B extends A{
    @Override//This is the annotation
    public void show(){
        System.out.println("In B Show");
    }
}

public class annotationsExample{
    public static void main(String [] args){
        B obj = new B();
        obj.show();
        
    }
}
