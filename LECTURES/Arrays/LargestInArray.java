package LECTURES.Arrays;
import java.util.*;
public class LargestInArray {
    public static int largestInArray(int arr[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
            if(smallest > arr[i]){
                smallest = arr[i];
            }
        }System.out.println("smallest value is: "+smallest);
        return largest;
    }
    public static void main(String[] args) {
        int arr[] = {-2,-3,-4,-16,-23,0};
        System.out.println("largest value is: "+largestInArray(arr));
    }
}
