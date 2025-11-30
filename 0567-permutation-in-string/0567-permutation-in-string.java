class Solution {
   public boolean checkInclusion(String s1, String s2) {
    if (s1.length() > s2.length()) return false;

    int[] need = new int[26];
    int[] window = new int[26];
    for (char c : s1.toCharArray()) {
        need[c - 'a']++;
    }

    int m = s1.length();
    for (int i = 0; i < m; i++) {
        window[s2.charAt(i) - 'a']++;
    }

    if (matches(need, window)) return true;
    for (int i = m; i < s2.length(); i++) {
        window[s2.charAt(i) - 'a']++;
        window[s2.charAt(i - m) - 'a']--;
        if (matches(need, window)) return true;
    }

    return false;
}

private boolean matches(int[] a, int[] b) {
    for (int i = 0; i < 26; i++) {
        if (a[i] != b[i]) return false;
    }
    return true;
}

}