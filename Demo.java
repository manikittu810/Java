
import java.util.*;
class Computer{
    public void playMusic(){
        System.out.println("PlayMusic");
    }
    public String getMePen(int cost){
        if(cost>=10){
             return "Pen";
        }
       else{
           return "Nothing";
       }
        
    }
}

public class Demo{
    public static void main(String [] args){
        Computer obj= new Computer();
        obj.playMusic();
        String str= obj.getMePen(0);
        System.out.println(str);
    }
}





















