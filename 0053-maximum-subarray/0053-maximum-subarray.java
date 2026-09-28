class Solution {
    public int maxSubArray(int[] nums) {
       int n = nums.length;
       int maxi = Integer.MIN_VALUE;
       int sum = 0;

       for(int num : nums) {
        sum += num;
        maxi = Math.max(maxi, sum);
        if(sum < 0) sum = 0;
       }

       return maxi;
    }
}