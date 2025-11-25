class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if ((long) m * k > bloomDay.length) return -1;
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        for (int x : bloomDay) {
            low = Math.min(low, x);
            high = Math.max(high, x);
        }

        int ans = high;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(possible(bloomDay, mid, m, k)==true){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
    public boolean possible(int[] arr,int day, int m, int k){
        int cnt = 0;
        int noOfB = 0;
        for(int i = 0; i<arr.length ; i++) {
            if(arr[i] <= day) {
                cnt++;
            }  
            else {
                noOfB += (cnt / k);
                cnt = 0;
            }
        }
        noOfB += (cnt / k);
        return noOfB >= m;
    }
}