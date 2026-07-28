class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        int fresh = 0, time = 0;

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        // Add all rotten oranges
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 2) q.offer(new int[]{i, j});
                else if (grid[i][j] == 1) fresh++;
            }
        }

        while (!q.isEmpty() && fresh > 0) {
            int size = q.size();

            while (size-- > 0) {
                int[] curr = q.poll();

                for (int k = 0; k < 4; k++) {
                    int nr = curr[0] + dr[k];
                    int nc = curr[1] + dc[k];

                    if (nr >= 0 && nc >= 0 && nr < m && nc < n &&
                        grid[nr][nc] == 1) {

                        grid[nr][nc] = 2;
                        fresh--;
                        q.offer(new int[]{nr, nc});
                    }
                }
            }
            time++;
        }

        return fresh == 0 ? time : -1;
    }
}