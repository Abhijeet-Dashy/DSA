class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        boolean[] merged = new boolean[n]; 
        List<int[]> result = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            if (merged[i]) continue; 
            
            int start = intervals[i][0];
            int end = intervals[i][1];
            for (int j = 0; j < n; j++) {
                if (i == j || merged[j]) continue;
                
                int s = intervals[j][0];
                int e = intervals[j][1];
                
                if (!(end < s || start > e)) {
                    start = Math.min(start, s);
                    end = Math.max(end, e);
                    merged[j] = true; 
                    j = -1;
                }
            }
            
            merged[i] = true;
            result.add(new int[]{start, end});
        }
        
        return result.toArray(new int[result.size()][]);
    }
}
