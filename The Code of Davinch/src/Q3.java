import java.util.*;
public class Q3 {
    public static void main(String[] args){
        int n=7;

        //Print upper half
        for(int i=1; i<n; i++){
            for(int j=1; j<i; j++){
                System.out.print(" ");
            }
            for(int j=i; j<=n; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        //Print lower half
        for(int i=n; i>=1; i--){
            for(int j=1; j<i; j++){
                System.out.print(" ");
            }
            for(int j=i; j<=n; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
