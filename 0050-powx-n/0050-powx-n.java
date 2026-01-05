class Solution {
    public double myPow(double x, int n) {
        long N = n;          // avoid overflow
        double ans = 1.0;

        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        while (N > 0) {
            if ((N & 1) == 1) {   // if odd
                ans *= x;
            }
            x *= x;
            N >>= 1;             // divide by 2
        }

        return ans;
    }
}
