package ASSIGNMENTS.Arrays;

import java.util.HashSet;
class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numbers = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(numbers.contains(nums[i])){
                return true;
            }numbers.add(nums[i]);
        }return false;
    }
}