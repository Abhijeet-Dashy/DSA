class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int asum = n*(n+1)/2;
        int esum = 0;
        for(int i = 0; i<n; i++){
            esum += nums[i];
        }
        return (asum - esum);
    }
}