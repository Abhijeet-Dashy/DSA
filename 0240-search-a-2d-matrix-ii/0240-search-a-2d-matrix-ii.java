class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        if (m == 0) return false;
        int n = matrix[0].length;
        if (n == 0) return false;

        int row = 0;
        int col = n - 1; // start from top-right

        while (row < m && col >= 0) {
            int val = matrix[row][col];

            if (val == target) {
                return true;
            } else if (val > target) {
                col--;      // move left
            } else { // val < target
                row++;      // move down
            }
        }

        return false; // not found
    }
}
