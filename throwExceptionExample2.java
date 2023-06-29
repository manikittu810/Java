class MsException extends RuntimeException{
    public  MsException(String string){
        super(string);
    }
}

public class throwExceptionExample2{
    public static void main(String args[]){
        int i=20;
        int j=0;
        try{
            j=2/i;
            if(j==0){
                throw new MsException("Arithmetic exception : cannot divide by zero");
            }
        }
            catch(MsException e){
                j=18/i;
                System.out.println("thats the default output" + e);
            }
            catch (Exception e){
                System.out.println("Something went wrong " + e);
            }
            System.out.println(j);
        System.out.println("Bye!");
    }
}

//Custom exception
