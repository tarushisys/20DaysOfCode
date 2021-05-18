import java.util.*;
public class MaxMinSum {
    public static void main(String[] args){
        int temp=0, maxsum=0, minsum=0;
        int[] arr= {1,2,5,4,3};

        for(int i=0; i<4; i++){
            for(int j =i+1; j<5; j++){
                if(arr[j] < arr[i]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        for(int i=0; i<4; i++){
            minsum = minsum + arr[i];
            maxsum = maxsum + arr[i+1];
        }

        System.out.println("The maximun sum is: "+maxsum);
        System.out.print("The minimum sum is: "+minsum);

    }
}