package Algorithms.searching;

public class LinearSearch {

    public static final int expectedElement1 = 110;
    public static final int expectedElement2 = 171;
    public static final int ElEMENT_NOT_FOUND = -1;

    public static int search(int arr[], int x){
        int left=0;
        int arrayLength=arr.length;
        int right=arrayLength-1;
        for(int i=0;left<=right;left++,right--){
            if(x==arr[left]){
                return left;
            }else if(x==arr[right]){
                return right;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={10, 20, 80, 30, 60, 50,110, 100, 130, 170};
        int result=search(arr, expectedElement1);
        if(result!= ElEMENT_NOT_FOUND){
            System.out.println("Element is present at index: "+result);
        }else{
            System.out.println("Element is not present in the array");
        }

        result=search(arr, expectedElement2);
        if(result!=ElEMENT_NOT_FOUND){
            System.out.println("Element is present at index: "+result);
        }else{
            System.out.println("Element is not present in the array");
        }

    }
}
