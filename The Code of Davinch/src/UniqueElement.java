import java.util.*;
public class UniqueElement {
    public static void main(String[] args){
        int i,j,n,count;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter elements: ");
        for(i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(i=0; i<n; i++){
            count = 0;
            for(j=0; j<n; j++){
                if(arr[i] == arr[j])
                    count++;
            }
            if(count==1)
                System.out.print(arr[i]+" ");
        }
    }
}
