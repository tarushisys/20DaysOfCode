import java.util.*;
public class LeftRotation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,m, temp,i,j;
        System.out.println("Enter number of elements: ");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements: ");
        for(i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the no of rotations: ");
        m = sc.nextInt();
        int k= arr.length;
        while(m>0){
            temp = arr[0];
            for(j=0; j<(k-1); j++){
                arr[j] = arr[j+1];
            }
            arr[n-1] = temp;
            m--;
        }


        System.out.println("Left Rotation: ");
        for( i=0; i<k; i++){
            System.out.print(arr[i] + " ");
        }

    }
}