class Solution {
    public int maxProduct(int[] nums) {
        int maxi = nums[0];
        int currMax = nums[0];
        int currMin = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];

            // Negative number swaps the role of max and min
            if (num < 0) {
                int temp = currMax;
                currMax = currMin;
                currMin = temp;
            }

            currMax = Math.max(num, currMax * num);
            currMin = Math.min(num, currMin * num);

            maxi = Math.max(maxi, currMax);
        }

        return maxi;
    }
}