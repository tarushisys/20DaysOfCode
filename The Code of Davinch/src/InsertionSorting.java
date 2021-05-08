import java.util.*;
public class InsertionSorting{
    public static void main(String[] args){
        int size, i,j,temp;
        int arr[] = new int[50];
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        size = sc.nextInt();

        System.out.println("Enter elements: ");
        for(i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        for(i=1; i<size; i++){
            temp = arr[i];
            j = i-1;
            while((temp<arr[j]) && (j>=0)){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = temp;
        }
        System.out.println("Sorted array: ");
        for(i=0; i<size; i++){
            System.out.print(arr[i] + " ");
        }
    }
}