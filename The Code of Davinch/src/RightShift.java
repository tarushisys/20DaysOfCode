import java.util.*;
public class RightShift {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,i,k=0;
        System.out.println("Enter array size: ");
        n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter elements: ");
        for(i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number to be shifted: ");
        int shift = sc.nextInt();
        for(i=0; i<n; i++){
            if(arr[i]!=shift){
                arr[k++] = arr[i];
            }
        }
        while(k<n){
            arr[k++] = shift;
        }

        for(i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
