import java.util.*;

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> heightToName = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            heightToName.put(heights[i], names[i]);
        }

        // Sort heights in descending order
        Integer[] sortedHeights = Arrays.stream(heights).boxed().toArray(Integer[]::new);
        Arrays.sort(sortedHeights, Collections.reverseOrder());

        // Build the result array
        String[] result = new String[names.length];
        for (int i = 0; i < sortedHeights.length; i++) {
            result[i] = heightToName.get(sortedHeights[i]);
        }

        return result;
    }
}