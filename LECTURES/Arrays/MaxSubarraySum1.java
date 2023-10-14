package LECTURES.Arrays;

public class MaxSubarraySum1 {
    public static void maxSubarraySum1(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                currSum = 0;
                for(int k=i; k<=j; k++){
                    currSum += arr[k];
                }System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }System.out.println("Max Subarray Sum = "+maxSum);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        maxSubarraySum1(arr);

    }
}
