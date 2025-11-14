class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        while(low <= high){
            if(nums[low]+nums[high] == target){
                return new int[]{low+1, high+1};
            }else if(nums[low]+nums[high] > target){
                high--;
            }else{
                low++;
            }
        }
        return new int[]{-1,-1};
    }
}