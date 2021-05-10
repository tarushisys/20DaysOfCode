import java.util.*;
public class Reverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,res,i,j=0;
        System.out.print("Enter the array length: ");
        n = sc.nextInt();

        int arr[] = new int[n];
        int rev[] = new int[n];
        System.out.print("Enter elements: ");
        for(i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Reverse array is: ");
        for(i=n; i>0; i--, j++){
            rev[j] = arr[i-1];
            System.out.print(rev[j] + ",");
        }
    }
}
