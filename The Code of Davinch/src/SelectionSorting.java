import java.util.*;
public class SelectionSorting {
    public static void main(String[] args){
        int size, i, j, temp, index = 0,m, count=0;
        int arr[] = new int[50];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        size = sc.nextInt();
        System.out.println("Enter the elements: ");

        for(i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Selection Sorting");
        for(i=0; i<(size-1); i++){

            for(j=(i+1); j<size; j++)
            {
                if(arr[j]<arr[i])
                {
                    temp = arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }

        }
        System.out.println("Sorted Array: ");
        for(i=0; i<size; i++){
            System.out.print(arr[i] + " ");
        }
    }
}