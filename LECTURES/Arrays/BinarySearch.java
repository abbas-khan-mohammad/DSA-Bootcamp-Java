package LECTURES.Arrays;

public class BinarySearch {
    public static int binarySearch(int arr[], int key){
        int start = 0, end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==key){
                return mid;
            }else if(arr[mid]<key){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }return -1;
    }
    public static void main(String[] args) {
        int arr[] = {10,12,36,44,59,70,98};
        int key = 70;
        System.out.println("key found at index: "+binarySearch(arr, key));
    }
}
