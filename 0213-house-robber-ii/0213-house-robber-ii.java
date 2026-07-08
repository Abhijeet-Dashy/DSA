class Solution {
    public int f(int[] nums , int l, int r){
        int prev = 0;
        int prev2 = 0;
        
        for (int i = l; i <= r; i++) {
            int current = Math.max(prev, prev2 + nums[i]);
            prev2 = prev;
            prev = current;
        }
        
        return prev;
    }
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];

        int ans1 = f(nums, 1, n-1);
        int ans2 = f(nums, 0, n-2);
        return Math.max(ans1, ans2);
    }
}