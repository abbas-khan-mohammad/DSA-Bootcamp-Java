package LECTURES.Arrays;

public class MaxSubarraySum3 {
    public static int maxSubarraySum3(int nums[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        if(nums.length==1){
            maxSum=nums[0];
            return maxSum;
        }
 
        for(int i=0; i<nums.length; i++){
            currSum += nums[i];
            maxSum = Math.max(maxSum, currSum);
            if(currSum < 0){
            currSum = 0;
        }
    }return maxSum;
}
    public static void main(String[] args) {
        int nums[] = {-2,-3,4,-1,-2,1,5,-3};
        System.out.println(maxSubarraySum3(nums));
    }
}
