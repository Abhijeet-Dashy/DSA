// class Solution {
//     public int[] rearrangeArray(int[] nums) {
//         int n = nums.length;
//         int[] pve = new int[n/2+1];
//         int[] nve = new int[n/2+1];
//         int j = 0, k = 0;
//         for(int i =0; i<n; i++){
//             if(nums[i]>0){
//                 pve[j] = nums[i];
//                 j++;
//             }else{
//                 nve[k] = nums[i];
//                 k++;
//             }
//         }
//         j = 0;
//         k = 0;
//         for(int i = 0; i < n/2; i++){
//             nums[2*i] = pve[i];
//             nums[2*i+1] = nve[i];
//         }
//         return nums;
//     }
// }
class Solution {
     public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int [] ans = new int[n];
        int pve = 0, nve = 1;
        for(int i =0; i<n; i++){
            if(nums[i]<0){
                ans[nve] = nums[i];
                nve+=2;
            }
            else{
                ans[pve] = nums[i];
                pve+=2;
            }
        }
        return ans;
    }
}