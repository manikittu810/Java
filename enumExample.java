enum Status{
    Running,Failed,Pending, Success;
}

public class enumExample{
    public static void main(String [] args){
        
        
        Status s=Status.Running;
        System.out.println(s);
        System.out.println(s.ordinal());
         
        
        Status s1=Status.Failed;
        System.out.println(s1);
        System.out.println(s1.ordinal());
        
        Status s2=Status.Pending;
        System.out.println(s2);
        System.out.println(s2.ordinal());
        
        Status s3=Status.Success;
        System.out.println(s3);
        System.out.println(s3.ordinal());
        
        Status []ss=Status.values();
        System.out.println(ss[3]);
        
        for(Status s5 : ss)
        System.out.println(s5 + " : "+s5.ordinal());
        
    }
}
