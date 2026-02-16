class Solution {
    public int numRescueBoats(int[] nums, int limit) {
        int n = nums.length;

        int c = 0;
        int l = 0;
        int r = n - 1;

        Arrays.sort(nums);

        while (l <= r) {

            int sum = nums[l] + nums[r];
            int rem = limit - sum;
            if (rem >= 0) {
                l++;
                c++;
                r--;
            }else if(nums[r]<=limit){
                r--;
                c++;
            }else{
                l++;
                r--;
            }
        }
        return c;
    }
}