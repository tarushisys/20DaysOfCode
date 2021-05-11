import java.util.*;
public class Candies {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i,j,n,m=0,count,unique=0;
        System.out.println("Enter array size: ");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements: ");
        for(i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(i=0; i<n; i++){
            count = 0;
            for(j=0; j<i; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count==1){
                unique++;
            }
        }
        System.out.print("Ethan will have " +unique+ " candies: ");
    }
}


