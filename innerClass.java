class A{
    
    int age; 
    public void show(){
        System.out.println("show A");
    }
     class B{
        public void config(){
        System.out.println("show B");
    }
    }
}

public class innerClass{
    public static void main(String args[]){
A obj=new A();
obj.show();
A.B obj1= obj.new B(); //here A.B represents Class B in Class A
obj1.config();
    }
} 

// if you wanna create object of class B you need the object of A. So we write obj.new B();
