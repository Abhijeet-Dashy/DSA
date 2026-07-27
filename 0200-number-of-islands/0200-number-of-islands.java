class Solution {
    public int numIslands(char[][] grid) {
        int islands = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {

                if (grid[i][j] == '1') {
                    dfs(grid, i, j);
                    islands++;
                }
            }
        }
        return islands;
    }

    private void dfs(char[][] grid, int row, int col) {
        // Out of bounds
        if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length) {
            return;
        }
        // Water or already visited
        if (grid[row][col] == '0') {
            return;
        }
        // Mark as visited
        grid[row][col] = '0';
        // Visit all 4 directions
        dfs(grid, row + 1, col);
        dfs(grid, row - 1, col);
        dfs(grid, row, col + 1);
        dfs(grid, row, col - 1);
    }
}