package Algorithms.searching;

public class BinarySearch {

    public static final int TARGET_ELEMENT = 60;
    public static final int ELEMENT_NOT_FOUND = -1;

    /**
     * Iterative Approach
     */
    public static int binarySearch_iterative(int arr[], int targetElement,int low,int high){
        while(high-low>-1){
            int mid=(low+high)/2;
            if(targetElement==arr[mid])
                return mid;
            else if(targetElement>arr[mid])
                low=mid+1;
            else
                high=mid-1;
        }
        return ELEMENT_NOT_FOUND;
    }

    /**
     * Recursive Approach
     */
    public static int binarySearch_recursive(int arr[], int targetElement,int low,int high){
        if(high>1){
            int mid=(low+high)/2;
            if(targetElement==arr[mid])
                return mid;
            else if(targetElement>arr[mid])
                return binarySearch_recursive(arr,targetElement,mid+1,high);
            else
                return binarySearch_recursive(arr,targetElement,low,mid-1);
        }
        return ELEMENT_NOT_FOUND;
    }

    public static void main(String[] args) {
        int arr[]={10, 20,30, 60,110, 130, 140, 170};
        int result_iterative=binarySearch_iterative(arr, TARGET_ELEMENT,0,arr.length-1);
        if(result_iterative==-1)
            System.out.println("Element is not found in given array by Iterative approach");
        else
            System.out.println("Element is found on index: "+result_iterative+" by iterative approach");

        int result_recursive=binarySearch_recursive(arr, TARGET_ELEMENT,0,arr.length-1);
        if(result_recursive==-1)
            System.out.println("Element is not found in given array by Recursive approach");
        else
            System.out.println("Element is found on index: "+result_recursive+" by Recursive approach");
     }
}
