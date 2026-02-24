class Solution {
    public int longestOnes(int[] nums, int k) {
        int max = 0;
        int n = nums.length;
        int len = 0;
        int l = 0;
        int r = 0;
        int z = 0;
        while(r<n){
            if(nums[r]==0) z++;
            while(z>k){
                if(nums[l]==0) z--;
                l++;
            }
            if(z<=k){
                len = r-l+1;
                max = Math.max(max, len);
            }
            r++;
        }
        return max;
    }
}