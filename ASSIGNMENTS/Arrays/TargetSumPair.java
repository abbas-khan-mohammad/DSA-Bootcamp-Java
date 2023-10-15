package ASSIGNMENTS.Arrays;

import java.util.Arrays;

public class TargetSumPair {
    public static void targetSumPair(int arr[], int target){
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length-1;
        while(left < right){
            if(arr[left] + arr[right] < target){
                left++;
            }else if(arr[left] + arr[right] > target){
                right--;
            }else{
                System.out.println("("+arr[left]+","+arr[right]+")");
                left++;
                right--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {7,15,3,18,6,4,19,2,12,11,9};
        int target = 15;
        targetSumPair(arr, target);
    }
}
