enum Laptop{
    Macbook(2200),Xps(1000),Surface,Thinkpad(1000);
    
    private int price;
    
     private  Laptop (){
        price=500;
    }
   private  Laptop (int price){
        this.price=price;
        System.out.println("The laptop is :" + this.name() +"\n");
    }
   
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price=price;
    }
}

public class enumClass{
    public static void main(String [] args){
        
        
        for(Laptop lap : Laptop.values()){
            System.out.println(lap +" : "+lap.getPrice()+"\n");
        }
        
    }
}
