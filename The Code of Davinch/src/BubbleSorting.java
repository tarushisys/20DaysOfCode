import java.util.*;
public class BubbleSorting {
    public static void main(String[] args){
        int size,i,j,temp;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size: ");
        size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter elements: " );
        for(i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }
        for (i = 0; i < size - 1; i++) {
                for (j = 0; j < size - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        System.out.print("Sorted Array: ");
        for(i=0; i<size; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
