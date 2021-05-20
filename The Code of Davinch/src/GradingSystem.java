import java.util.*;
import java.math.*;
public class GradingSystem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("Enter no. of students: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter grades");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for( i=0; i<n; i++)
        {
            if(arr[i]<38)
            {
                continue;
            }
            if((arr[i]%5)>=3)
            {
                arr[i] = arr[i] + (5-(arr[i]%5));
            }
            else{
                continue;
            }
        }
        for( i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}