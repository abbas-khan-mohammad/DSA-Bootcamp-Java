package ASSIGNMENTS.Arrays;

public class SearchInRotatedSortedArray {
    public static int searchInRotatedSortedArray(int nums[], int target){
                int lo = 0;
                int hi = nums.length-1;
                while(lo <= hi){
                    int mid = (lo+hi)/2;
                    if(target == nums[mid]){
                        return mid;
                    }else if(nums[lo]<=nums[mid]){
                        if(target >= nums[lo] && nums[mid] > target){
                            hi = mid - 1;
                        }else{
                            lo = mid + 1;
                        }
                    }else if(nums[mid]<=nums[hi]){
                        if(target > nums[mid] && nums[hi] >= target){
                            lo = mid + 1;
                        }else{
                            hi = mid - 1;
                        }
                    }
                }return -1;
            }
    public static void main(String[] args) {
        int nums[] = {4,5,6,7,8,9,10,1,2};
        int target = 2;
        System.out.println(searchInRotatedSortedArray(nums, target));
    }
}
