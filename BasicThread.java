class A extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Hi");
            try{
                Thread.sleep(10);
            }
            catch(InterruptedException e){
                System.out.println("Waiting  time");
            }
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Hello");
        }
        try{
                Thread.sleep(10);
            }
            catch(InterruptedException e){
                System.out.println("Waiting  time");
            }
    }
}
public class BasicThread {
    public static void main(String args[]) {
     A obj= new A();
     B obj1=new B();
     System.out.println(obj1.getPriority());
      System.out.println(obj.getPriority());
     obj.start();
     try{
                Thread.sleep(2);
            }
            catch(InterruptedException e){
                System.out.println("Waiting  time");
            }
     obj1.start();
     
     
    }
}

// Basic Thread
