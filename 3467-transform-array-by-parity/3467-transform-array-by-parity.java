class Solution {
    public void r1(int[] nums){
        int n = nums.length;
        for(int i = 0; i<n; i++){
            if(nums[i]%2 != 0) nums[i] = 1;
        }
    }

    public void r0(int[] nums){
        int n = nums.length;
        for(int i = 0; i<n; i++){
            if(nums[i]%2 == 0) nums[i] = 0;
        }
    }

    public int[] transformArray(int[] nums) {
        r0(nums);
        r1(nums);
        Arrays.sort(nums);
        return nums;
        
    }
}