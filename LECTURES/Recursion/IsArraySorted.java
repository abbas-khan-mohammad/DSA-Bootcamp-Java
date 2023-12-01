package LECTURES.Recursion;

public class IsArraySorted {
    public static boolean isArraySorted(int arr[], int idx){
        if(idx == arr.length-1){
            return true;
        }
        if(arr[idx]<arr[idx+1]){
            //array is sorted till now
            return isArraySorted(arr, idx+1);
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,3,3};
        System.out.println(isArraySorted(arr, 0));
    }
}
