class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";
        
        int[] need = new int[128]; 
        for (char c : t.toCharArray()) {
            need[c]++;
        }
        
        int left = 0;
        int count = t.length();
        int minLen = Integer.MAX_VALUE;
        int start = 0;
        
        for (int right = 0; right < s.length(); right++) {
            char rChar = s.charAt(right);
            
            if (need[rChar] > 0) {
                count--;
            }
            need[rChar]--;
            
            while (count == 0) {  // valid window
                
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }
                
                char lChar = s.charAt(left);
                need[lChar]++;
                
                if (need[lChar] > 0) {
                    count++;
                }
                
                left++;
            }
        }
        
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}