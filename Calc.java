//Inheritance

public class Calc{
    public int add(int n1,int n2){
       return n1+n2;
    }
    public int sub(int n1,int n2){
        return n1-n2;
    }
    public int  multi(int n1,int n2)
    {
        return n1*n2;
    }
}


public class AdvCalc extends Calc{
    
    public int divi(int n1,int n2){
        return n1/n2;
    }
}




public class Demo { 
    public static void main(String args[]){
        Calc obj=new Calc();
        System.out.println(obj.add(1,2));
        System.out.println(obj.sub(1,2));
        System.out.println(obj.multi(1,2));
        
        AdvCalc obj1 = new AdvCalc();
        System.out.println(obj1.add(1,2));
        System.out.println(obj1.sub(1,2));
        System.out.println(obj1.multi(1,2));
    }
}
