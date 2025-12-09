class Solution {
    public int romanToInt(String s) {
        int total = 0;
        
        for (int i = 0; i < s.length(); i++) {
            int value = valueOf(s.charAt(i));
            
            if (i + 1 < s.length()) {
                int nextValue = valueOf(s.charAt(i + 1));
                if (value < nextValue) {
                    total -= value;
                    continue;
                }
            }
            
            total += value;
        }
        
        return total;
    }
    
    private int valueOf(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return 0; // shouldn't happen for valid input
    }
}
