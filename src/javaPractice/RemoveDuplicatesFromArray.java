package javaPractice;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int j=0;
        int[] arr={1, 10, 2, 2, 10, 3, 3, 3, 4, 5, 5};
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                arr[j++]=arr[i];
            }
        }
        arr[j++]=arr[arr.length-1];
        for(int i=0;i<j;i++){
            System.out.println(arr[i]);
        }
    }
}
