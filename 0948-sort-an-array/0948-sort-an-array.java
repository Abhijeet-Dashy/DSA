class Solution {

    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) arr[k++] = left[i++];
            else arr[k++] = right[j++];
        }

        while (i < left.length) arr[k++] = left[i++];
        while (j < right.length) arr[k++] = right[j++];
    }

    public int[] sortArray(int[] nums) {
        if (nums.length <= 1) return nums;

        int mid = nums.length / 2;
        int[] left = new int[mid];
        int[] right = new int[nums.length - mid];

        for (int i = 0; i < mid; i++) left[i] = nums[i];
        for (int i = mid; i < nums.length; i++) right[i - mid] = nums[i];

        left = sortArray(left);
        right = sortArray(right);

        int[] merged = new int[nums.length];
        merge(merged, left, right);

        return merged;
    }
}
