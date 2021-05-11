import java.util.*;
public class MaxRepeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j,n,m=0,count=0,temp;
        System.out.println("Enter array size: ");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements: ");
        for(i=0;i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(i=0; i<n; i++){
            temp = arr[i];
            int tempCount = 0;
            for(j=0; j<n; j++){
                if(arr[i] == temp){
                    tempCount++;
                }
                if(tempCount>count){
                    m = temp;
                    count = tempCount;
                }
            }
        }
        System.out.print("The max occurring element is: "+m);
    }
}



