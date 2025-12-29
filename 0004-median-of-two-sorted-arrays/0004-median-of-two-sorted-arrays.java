class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {
        int n1 = a.length, n2 = b.length;
        int n = n1 + n2;

        int ind2 = n / 2;
        int ind1 = ind2 - 1;

        int i = 0, j = 0, cnt = 0;
        int ind1el = 0, ind2el = 0;

        // Merge like merge sort
        while (i < n1 && j < n2) {
            int val;
            if (a[i] <= b[j]) {
                val = a[i++];
            } else {
                val = b[j++];
            }

            if (cnt == ind1) ind1el = val;
            if (cnt == ind2) ind2el = val;
            cnt++;
        }

        // Remaining elements of array a
        while (i < n1) {
            if (cnt == ind1) ind1el = a[i];
            if (cnt == ind2) ind2el = a[i];
            cnt++;
            i++;
        }

        // Remaining elements of array b
        while (j < n2) {
            if (cnt == ind1) ind1el = b[j];
            if (cnt == ind2) ind2el = b[j];
            cnt++;
            j++;
        }

        // Calculate median
        if (n % 2 == 1) {
            return ind2el;
        } else {
            return (ind1el + ind2el) / 2.0;
        }
    }
}
