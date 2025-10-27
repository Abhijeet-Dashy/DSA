//moore's voting algo - [5,5,7,5,7,5,5,5,5] when cnt is 0 take the element at the index then incr once then increment when that element occurs again and decr when smth else appears. when cnt hits 0, evaluate is the length of the subarray strting from when cnt was 0 is greater than n/2 or not if yes then its the majority element.

class Solution {
    public int majorityElement(int[] nums) {
        int cnt =0;
        int ele =0;
        for(int i =0; i<nums.length; i++){
            if(cnt == 0){
                ele = nums[i];
                cnt = 1;
            }else if(nums[i] == ele){
                cnt++;
            }else{
                cnt--;
            }
        }

        int cnt1 = 0;
        for(int i =0; i<nums.length; i++){
            if(nums[i] == ele) cnt1++;
        }
        
        if(cnt1>nums.length/2){
            return ele;
        }
        return -1;
    }
}