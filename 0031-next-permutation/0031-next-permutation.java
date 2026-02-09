class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        boolean isSorted = true;
       for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {

                int j = n - 1;
                while (nums[j] <= nums[i]) {
                    j--;
                }
                swap(nums, i, j);
                reverse(nums, i + 1, n - 1);
                isSorted = false;
                break;
            }
            else{
                continue;
            }
        }
        if(isSorted){
            Arrays.sort(nums);
        }
    }
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void reverse(int[] nums, int l, int r) {
        while (l < r) {
            swap(nums, l++, r--);
        }
    }
}