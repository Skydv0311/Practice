package Algorithms.searching;

public class JumpSearch {

    public static int jumpSearch(int[] arr, int targetElement)
    {
        int n = arr.length;

        int step=(int)Math.floor(Math.sqrt(n));
        int jump=step;
        int prev=0;
        while(step<n && arr[step-1]<targetElement){
            prev=step;
            step+=jump;
        }

        while(prev<=targetElement){
            if(arr[prev]==targetElement)
                return prev;
            prev++;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={10, 20,30, 60,110, 130, 140, 170};

        int targetElement = 10;

        int index = jumpSearch(arr, targetElement);

        System.out.println("\nNumber " + targetElement +
                " is at index " + index);
    }
}
