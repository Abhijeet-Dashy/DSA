import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();

        if (n < 4) return ans;
        Arrays.sort(nums);
        
        for (int i = 0; i < n - 3; i++) {
            // Fix 1: Use 'if' instead of 'while' to avoid infinite loops
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            for (int j = i + 1; j < n - 2; j++) {
                // Fix 2: Use 'if' and correct index boundaries
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                int l = j + 1;
                int k = n - 1;

                while (l < k) {
                    // Fix 3: Cast elements to long individually to prevent integer overflow
                    long sum = (long) nums[i] + nums[j] + nums[l] + nums[k];
                    
                    if (sum == target) {
                        ans.add(Arrays.asList(nums[i], nums[j], nums[l], nums[k]));

                        // Fix 4: Correct pointer conditions (l < k) and increment/decrement
                        while (l < k && nums[l] == nums[l + 1]) l++;
                        while (l < k && nums[k] == nums[k - 1]) k--;
                        
                        // Fix 5: Move pointers out of the current valid set
                        l++;
                        k--;
                    } 
                    else if (sum < target) {
                        l++;
                    } 
                    else {
                        k--;
                    }
                }
            }
        }
        return ans;
    }
}
