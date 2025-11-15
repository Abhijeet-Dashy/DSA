class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n == 0) return 0;
        int[] lastSeen = new int[256];
        Arrays.fill(lastSeen, -1);

        int maxLen = 0;
        int start = 0;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (lastSeen[ch] >= start) {
                start = lastSeen[ch] + 1;
            }
            lastSeen[ch] = i;
            maxLen = Math.max(maxLen, i - start + 1);
        }

        return maxLen;
    }
}
