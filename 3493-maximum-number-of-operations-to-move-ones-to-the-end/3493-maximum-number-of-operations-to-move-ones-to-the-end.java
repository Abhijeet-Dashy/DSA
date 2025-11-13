class Solution {
    public int maxOperations(String s) {
        int totalOps = 0;
        int onesCount = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                // We've encountered a '1', add it to our current block
                onesCount++;
            } else { // s.charAt(i) == '0'
                // Check if this '0' is at the start of a zero-block
                // (i.e., it follows a '1')
                if (i > 0 && s.charAt(i - 1) == '1') {
                    // If so, we've found a "10" boundary.
                    // The entire block of 'onesCount' '1's we've seen
                    // will eventually need to be moved.
                    // This adds 'onesCount' operations to our total.
                    totalOps += onesCount;
                }
            }
        }
        
        return totalOps;
    }
}