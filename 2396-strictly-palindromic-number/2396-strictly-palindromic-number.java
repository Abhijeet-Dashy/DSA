class Solution {
    public boolean isStrictlyPalindromic(int n) {
        for(int i = n-2; i>=2; i--){
            if(!isPalindrome(n,i)){
                return false;
            }
        }
        return true;
    }
    public static boolean isPalindrome(int num, int base) {
        String digits = "0123456789ABCDEF";
        StringBuilder converted = new StringBuilder();

        int temp = num;

        // convert decimal to given base
        while (temp > 0) {
            int remainder = temp % base;
            converted.append(digits.charAt(remainder));
            temp = temp / base;
        }

        String value = converted.reverse().toString();

        // check palindrome
        int i = 0;
        int j = value.length() - 1;

        while (i < j) {
            if (value.charAt(i) != value.charAt(j))
                return false;
            i++;
            j--;
        }

        return true;
    }
}