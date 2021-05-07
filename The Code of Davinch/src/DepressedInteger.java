import java.util.*;
public class DepressedInteger {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int total,i;
        int k=0;
        System.out.println("Enter the size of array :");
        total=sc.nextInt();
        int arr[]=new int[total];
        System.out.println("enter the elements");
        for(i=0;i<total;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<total;i++)
        {
            k=k^arr[i];
        }
        System.out.println("element which is not repeated is : "+k);
    }
}
