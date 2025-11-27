class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0, high = 0;

        for (int w : weights) {
            low = Math.max(low, w);
            high += w;
        }

        while (low < high) {
            int mid = (low + high) / 2;
            int needed = 1, current = 0;

            for (int w : weights) {
                if (current + w > mid) {
                    needed++;
                    current = 0;
                }
                current += w;
            }

            if (needed <= days) {
                high = mid;     // try smaller ship
            } else {
                low = mid + 1;  // need bigger ship
            }
        }

        return low;
    }
}
