class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);  // Step 1: sort
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] candidates, int target, int start, 
                           List<Integer> current, List<List<Integer>> result) {
        
        // If target becomes 0 → valid combination found
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            
            // Step 3: skip duplicates at same level
            if (i > start && candidates[i] == candidates[i - 1]) continue;

            // If number is bigger than remaining target → stop (array is sorted)
            if (candidates[i] > target) break;

            // Choose
            current.add(candidates[i]);

            // Explore (move forward, can't reuse same element)
            backtrack(candidates, target - candidates[i], i + 1, current, result);

            // Un-choose (backtrack)
            current.remove(current.size() - 1);
        }
    }
}
