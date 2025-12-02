class Solution {
    public int lengthOfLastWord(String s) {
        int r = s.length() - 1;
        char[] chars = s.toCharArray();
        while (r >= 0 && chars[r] == ' ') {
            r--;
        }
        int c = 0;
        while (r >= 0 && chars[r] != ' ') {
            c++;
            r--;
        }

        return c;
    }
}
