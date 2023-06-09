import java.util.*;

public class OneDArrayMedium {

    public static boolean canWin(int leap, int[] game) {
        return canWin(leap,game,0);
    }
        // Return true if you can win the game; otherwise, return false.
    public static boolean canWin(int leap, int[] game,int i) {
        if(i>=game.length){
            return true;
        }else if (i<0 || game[i]==1){
            return false;
        }
        game[i]=1;
        return canWin(leap, game,i-1) || canWin(leap, game,i+1) || canWin(leap, game,i+leap);
         
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
