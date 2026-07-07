class Solution {
    public int maxJump(int[] stones) {
        int n = stones.length;
        // The minimum possible maximum jump must be at least the first jump
        int result = stones[1] - stones[0];
        
        // Check jumps of size 2 (skip one stone)
        // This covers the optimal strategy where forward jumps skip one,
        // and backward jumps cover the skipped ones.
        for (int i = 0; i < n - 2; i++) {
            int jump = stones[i + 2] - stones[i];
            result = Math.max(result, jump);
        }
        
        return result;
    }
}