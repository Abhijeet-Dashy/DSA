class Solution {
    public int maxOperations(int[] nums, int k) {
        int n = nums.length;
        int c = 0;
        int i = 0;
        int j = n-1;
        Arrays.sort(nums);
        while(i<j){
            int sum = nums[i]+nums[j];
            if(sum == k){
                i++;
                j--;
                c++;
            }else if(sum < k){
                i++;
            }else{
                j--;
            }
            
        }
        return c;
    }
}