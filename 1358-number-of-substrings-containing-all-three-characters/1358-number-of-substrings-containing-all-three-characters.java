class Solution {
    public int numberOfSubstrings(String s) {
        int[] count = new int[3]; // 0 -> a, 1 -> b, 2 -> c
        int left = 0;
        int result = 0;
        int n = s.length();

        for (int right = 0; right < n; right++) {
            count[s.charAt(right) - 'a']++;

            // While window contains at least one a, b, and c
            while (count[0] > 0 && count[1] > 0 && count[2] > 0) {
                result += (n - right);
                count[s.charAt(left) - 'a']--;
                left++;
            }
        }

        return result;
    }
}