class Solution {
    public int findPeakElement(int[] nums) {
        int low = 0, high = nums.length - 1;
        
        while (low < high) {
            int mid = low + (high - low) / 2;
            
            if (nums[mid] < nums[mid + 1]) {
                // slope goes up → peak is to the right
                low = mid + 1;
            } else {
                // slope goes down or mid is a peak → stay left
                high = mid;
            }
        }
        
        return low; // low == high, position of a peak
    }
}
