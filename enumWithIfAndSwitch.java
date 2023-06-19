enum Status{
   Running,Failed,Pending,Success;
   
}

public class enumWithIfAndSwitch{
    public static void main(String [] args){
        
        // Status s=Status.Pending;
        // System.out.println(s);
        for(Status s : Status.values()){
        //   Status s=Status.Pending;
        
        if(s==Status.Running){
        System.out.println("All good"+" : " + s.ordinal());
        }
        
        else if(s==Status.Failed){
  
        System.out.println("failed" +" : " + s.ordinal());   
        }
        
        else if(s==Status.Pending){
  
        System.out.println("Pending" +" : " + s.ordinal());   
        }
        
        else{
        System.out.println("Done" +" : " + s.ordinal()) ;   
        }
        }
        
        System.out.println();
        for(Status s : Status.values()){
     switch(s){
         case Running : System.out.println("all okay" +" : " + s.ordinal());
                        break;
          
        case Pending : System.out.println("Pending" +" : " + s.ordinal());
                        break;
        case Failed : System.out.println("failed " +" : " + s.ordinal());
                        break;
        default :    System.out.println("success" +" : " + s.ordinal());
                        break;
     }
     }
        
    }
}
