import java.util.*;
public class MissingNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,i;
        System.out.println("Enter array size: ");
        n = sc.nextInt();
        int inputarr[] = new int[n];
        System.out.print("Enter elements:  ");
        for(i=0; i<n; i++){
            inputarr[i] = sc.nextInt();
        }
        int sumofall = (n*(n+1))/2;
        int sumofarr = 0;
        for(i=0; i<n-1; i++){
            sumofarr = sumofarr + inputarr[i];
        }
        int MissingNumber = sumofall - sumofarr;
        System.out.println("Missing number is: "+MissingNumber);
    }
}
