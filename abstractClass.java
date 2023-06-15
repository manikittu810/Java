abstract class Car{
    
     public void playMusic(){
         System.out.println("in music");
     }
       public abstract  void drive();
       public abstract  void fly();
    }
   abstract class maruthi extends Car{
        public void drive(){
            System.out.println("In driving");
        }
    }
     class nano extends maruthi{
        public void fly(){
            System.out.println("In fly...!!   :) ");
        }
    }

public class abstractClass{
    public static void main(String args[]){
Car obj=new nano();
obj.drive();
obj.playMusic();
obj.fly();
    }
} 
