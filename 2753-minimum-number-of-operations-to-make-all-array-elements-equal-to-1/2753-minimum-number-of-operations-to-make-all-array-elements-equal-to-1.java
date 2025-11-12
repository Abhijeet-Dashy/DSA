class Solution {
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public int minOperations(int[] nums) {
        int n = nums.length;
        int c = 0;

        // Step 1: Count how many 1s exist
        int ones = 0;
        for (int x : nums) {
            if (x == 1) ones++;
        }

        // Case 1: If we already have some 1s
        if (ones > 0) {
            return n - ones;  // Just make all others 1
        }

        // Step 2: Find the shortest subarray with GCD = 1
        int minLen = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int g = nums[i];
            for (int j = i + 1; j < n; j++) {
                g = gcd(g, nums[j]);
                if (g == 1) {
                    minLen = Math.min(minLen, j - i + 1);
                    break; // Found shortest for this i
                }
            }
        }

        // Step 3: If no subarray with GCD=1, impossible
        if (minLen == Integer.MAX_VALUE) {
            return -1;
        }

        // Step 4: Total = (minLen - 1) + (n - 1)
        return (minLen - 1) + (n - 1);
    }
}
