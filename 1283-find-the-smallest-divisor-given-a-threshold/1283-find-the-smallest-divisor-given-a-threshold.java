class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = 0;

        // find max element for high
        for (int x : nums) {
            high = Math.max(high, x);
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (sumByD(nums, mid) <= threshold) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    public int sumByD(int[] arr, int div) {
        int sum = 0;

        for (int x : arr) {
            sum += (int) Math.ceil((double) x / div);
        }

        return sum;
    }
}
