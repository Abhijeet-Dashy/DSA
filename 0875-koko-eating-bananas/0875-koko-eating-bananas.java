class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = Arrays.stream(piles).max().getAsInt();
        while (low <= high) {
            int mid = (low + high) / 2;
            int totalH = calculateTotalHours(piles, mid);
            if (totalH <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public int calculateTotalHours(int[] piles, int hourly) {
        int totalH = 0;
        for (int pile : piles) {
            totalH += Math.ceil((double) pile / hourly);
        }
        return totalH;
    }
}
