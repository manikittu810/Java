
class Counter{
    int count;
    public synchronized void increment(){ //for synchronized count and synchronized state
        count++;
    }
}
public class exampleCountThread {
    public static void main(String args[]) throws InterruptedException{
        Counter c=new Counter();
     Runnable obj=() -> { //creating an anonymous class using lambda expression
         
        for(int i=0;i<10000;i++){
           c.increment();
        }
     };
     
     
     Runnable obj1=()->{
         
        for(int i=0;i<10000;i++){
           c.increment();
        }
     };
     
     Thread t1=new Thread(obj);
     Thread t2=new Thread(obj1);
     
     t1.start();
     t2.start();
     t1.join();//waits for other thread to join
     t2.join();
     System.out.println(c.count);
    }
}

// implementing a Thread
