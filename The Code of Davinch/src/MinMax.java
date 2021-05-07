import java.util.*;
public class MinMax {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Enter the size of array: ");

        n = sc.nextInt();
        int arr[] = new int[n];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        System.out.println("Enter the elements");

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            if(arr[i]<min){
                min = arr[i];
            }
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Maximun element is: "+max);
        System.out.println("Minimun element is: "+min);
    }
}
