// class A implements Runnable{
//     public void run(){
//         for(int i=0;i<5;i++){
//             System.out.println("Hi");
//             try{
//                 Thread.sleep(10);
//             }
//             catch(InterruptedException e){
//                 System.out.println("Waiting  time");
//             }
//         }
//     }
// }
class B implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
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
public class exampleRunnableThread {
    public static void main(String args[]) {
     Runnable obj=() -> { //creating an anonymous class using lambda expression
         
        for(int i=0;i<5;i++){
            System.out.println("Hi");
            try{
                Thread.sleep(10);
            }
            catch(InterruptedException e){
                System.out.println("Waiting  time");
            }
        }
     };
     
     
     Runnable obj1=()->{
         
        for(int i=0;i<5;i++){
            System.out.println("Hello");
            try{
                Thread.sleep(10);
            }
            catch(InterruptedException e){
                System.out.println("Waiting  time");
            }
        }
     };
     
     Thread t1=new Thread(obj);
     Thread t2=new Thread(obj1);
     
     t1.start();
     t2.start();
    }
}

// implementing a Thread
