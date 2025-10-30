import java.util.*;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> mp = new HashMap<>();
        int n = nums.length;
        int times = n / 3;

        for (int i = 0; i < n; i++) {
            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
        }

        for (int key : mp.keySet()) {
            if (mp.get(key) > times) {
                ans.add(key);
            }
        }

        Collections.sort(ans);
        return ans;
    }
}
