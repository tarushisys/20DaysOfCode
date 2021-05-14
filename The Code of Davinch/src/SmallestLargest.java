import java.util.*;
public class SmallestLargest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n, temp, i, j;
        System.out.println("Enter array size: ");
        n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter the elements: ");
        for(i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(i=0; i<(n-1); i++){
            for(j=i+1; j<n; j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            //  return arr[2];
            //return arr[n-3];
        }
        System.out.println("Third smallest: "+arr[2]);
        System.out.println("Third largest: "+arr[n-3]);
    }
}
