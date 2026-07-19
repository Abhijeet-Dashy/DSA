import java.util.*;

class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        // Step 2: Convert map entries to a list for sorting
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(freqMap.entrySet());

        list.sort((a, b) -> b.getValue() - a.getValue());

        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : list) {
            char c = entry.getKey();
            int count = entry.getValue();
            for (int i = 0; i < count; i++) {
                result.append(c);
            }
        }

        return result.toString();
    }
}