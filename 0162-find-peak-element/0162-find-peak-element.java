class Solution {
    public int findPeakElement(int[] arr) {
        int n = arr.length;
        int l = 0;
        int h = n-1;
        if(n == 1) return 0;
        if(arr[0] > arr[1]) return 0;
        if(arr[n-1] > arr[n-2]) return n-1;

        while(l<=h){
            int m = (l+h)/2;

            if(arr[m] > arr[m+1] && arr[m] > arr[m-1]) return m;

            else if(arr[m] <= arr[m+1]) l++;

            else if(arr[m] <= arr[m-1]) h--;
        }

        return -1;
    }
}
