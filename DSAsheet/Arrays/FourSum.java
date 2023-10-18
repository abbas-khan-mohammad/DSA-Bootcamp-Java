package DSAsheet.Arrays;
import java.util.*;
public class FourSum {
    public static List<List<Integer>> twoSum(int nums[], int si, int ei, int target){
        int left = si;
        int right = ei;
        List<List<Integer>> res = new ArrayList<>();
        while(left < right){
            if(left != si && nums[left] == nums[left -1]){
                left++;
                continue;
            }
            long sum = nums[left] + nums[right];

            if(sum == target){
                List<Integer> subRes = new ArrayList<>();
                subRes.add(nums[left]);
                subRes.add(nums[right]);
                res.add(subRes);
                left++;
                right--;
            }else if(sum > target){
                right--;
            }else{
                left++;
            }
        }
        return res;
    }
    public static List<List<Integer>> threeSum(int nums[], int target, int si){
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        if(n - si < 3) return res;

        for(int i=si; i<=n-3; i++){
            if(i != si && nums[i] == nums[i-1]) continue;

            int val1 = nums[i];
            int targ = target - val1;
            List<List<Integer>> subRes = twoSum(nums, i+1, n-1, targ);
            for(List<Integer> list : subRes){
                list.add(val1);
                res.add(list);
            }
        }
        return res;
    }
    public static List<List<Integer>> fourSum(int[] nums, int target){
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        if(n < 4){
            return res;
        }

        Arrays.sort(nums);

        for(int i=0; i<=n-4; i++){
            if(i != 0 && nums[i]==nums[i-1]){
                continue;
            }
            int val1 = nums[i];
            List<List<Integer>> subRes = threeSum(nums, target - val1, i+1);
            for(List<Integer> list : subRes){
                list.add(0, val1);
                res.add(list);
            }
        } return res;
    }
    public static void main(String[] args) {
        int nums[] = {4,5,6,10,10,15,20};
        int target = 40;
        System.out.println(fourSum(nums, target));
    }
}