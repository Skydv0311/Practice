package Algorithms.searching;

public class InterpolationSearch {
        public static final int TARGET_ELEMENT = 60;
        public static final int ELEMENT_NOT_FOUND = -1;

        /**
         * Iterative Approach
         */
        public static int InterpolationSearch_iterative(int arr[], int targetElement,int low,int high){
            int pos;
            while(high-low>-1){
                pos=low+(((high-low)*(targetElement-arr[low]))/(arr[high]-arr[low]));
                if(targetElement==arr[pos])
                    return pos;
                else if(targetElement>arr[pos])
                    low=pos+1;
                else
                    high=pos-1;
            }
            return ELEMENT_NOT_FOUND;
        }

        /**
         * Recursive Approach
         */
        public static int InterpolationSearch_recursive(int arr[], int targetElement,int low,int high){
            int pos;
            if(low<high && targetElement>arr[low] && targetElement<arr[high]){
                pos=low+(((high-low)*(targetElement-arr[low]))/(arr[high]-arr[low]));
                if(targetElement==arr[pos])
                    return pos;
                else if(targetElement>arr[pos])
                    return InterpolationSearch_recursive(arr,targetElement,pos+1,high);
                else
                    return InterpolationSearch_recursive(arr,targetElement,low,pos-1);
            }
            if(arr[low]==targetElement){
                return low;
            }
            return ELEMENT_NOT_FOUND;
        }

        public static void main(String[] args) {
            int arr[]={10, 20,30, 60,110, 130, 140, 170};
            int result_iterative=InterpolationSearch_iterative(arr, TARGET_ELEMENT,0,arr.length-1);
            if(result_iterative==-1)
                System.out.println("Element is not found in given array by Iterative approach");
            else
                System.out.println("Element is found on index: "+result_iterative+" by iterative approach");

            int result_recursive=InterpolationSearch_recursive(arr, TARGET_ELEMENT,0,arr.length-1);
            if(result_recursive==-1)
                System.out.println("Element is not found in given array by Recursive approach");
            else
                System.out.println("Element is found on index: "+result_recursive+" by Recursive approach");
        }
    }
