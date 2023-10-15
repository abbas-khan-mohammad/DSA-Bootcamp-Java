package ASSIGNMENTS.Arrays;

import java.util.Arrays;

public class TwoSumTargetSumUniquePairs {
    public static void twoSumTargetSumUniquePairs(int nums[], int target){
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length-1;
        while(left < right){
            if(left != 0 && nums[left] == nums[left-1]){
                left++;
                continue;
            }
            if(nums[left] + nums[right] < target){
                left++;
            }else if(nums[left] + nums[right] > target){
                right--;
            }else{
                System.out.println("["+left+","+right+"]");
                left++;
                right--;
            }
        }
    }
    public static void main(String[] args) {
        int nums[] = {2,2,4,3,1,6,6,7,5,9,1,8,9};
        int target = 10;
        twoSumTargetSumUniquePairs(nums, target);
    }
}
