import java.util.*;
public class Q5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=0,m = 0,k=0,i;

        System.out.println("Enter array size: ");
        n= sc.nextInt();
        int arr[] = new int[n];
        System.out.println("       ");
        System.out.println("Enter the elements of array: ");

        for(i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("      ");
        System.out.println("Enter the element to be searched: ");
        k=sc.nextInt();

        System.out.println("      ");

        for(i=0; i<n; i++) {
            if (arr[i] == k) {
                m = 1;
                break;
            } else {
                m = 0;
            }
        }
        if(m==1){
            System.out.println("The element is at: "+(i+1));
        }
        else{
            System.out.println("-1");
        }

    }
}
