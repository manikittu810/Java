class A{
      public void show1(){
         System.out.println("in A Show");
     }
    }
    
class B extends A{
    public void show2(){
        System.out.println("in b");
    }
}

public class uDcast{
    public static void main(String args[]){
  A a=new B();//UpCasting
  a.show1();
  
  B obj=(B) a;//Downcasting
  obj.show2();
    }
} 
