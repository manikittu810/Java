public class RunnableLambdaThread {
    public static void main(String args[]) throws InterruptedException{
       
     Runnable obj=() -> { //creating an anonymous class using lambda expression

        for(int i=0;i<5;i++){
           try{
               System.out.println("Hello");
               Thread.sleep(10);
           }
           catch(InterruptedException e){
               e.printStackTrace();
           }
        }
     };


     Runnable obj1=()->{

        for(int i=0;i<5;i++){
           try{
                 System.out.println("smk");

               Thread.sleep(10);//10 milliseconds
           }
           catch(InterruptedException e){
               e.printStackTrace();
           }
        }
     };

     Thread t1=new Thread(obj);
     Thread t2=new Thread(obj1);

     t1.start();
     t2.start();
   
    }
}
