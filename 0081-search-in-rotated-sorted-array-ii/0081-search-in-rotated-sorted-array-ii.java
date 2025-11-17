//brute force approach - linear search
class Solution {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]==target){
                return true;
            }
            if(nums[low] == nums[mid] && nums[mid] == nums[high]) {
                low++;
                high --;
                continue;
            }
            //check which part is sorted
            if(nums[low]<=nums[mid]){
                //if left sorted
                if(nums[low] <= target && target <= nums[mid]){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
                //if right sorted
            }else{
                if(nums[mid]<=target && nums[high]>=target){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        }
        return false;
    }
}