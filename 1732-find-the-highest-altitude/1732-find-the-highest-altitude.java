class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int [] tmp = new int[n+1];

        tmp[0] = 0;
        for(int i = 0; i<n; i++){
            tmp[i+1] = gain[i] + tmp[i]; 
        }

        int maxi = 0;
        for(int i = 0; i<tmp.length; i++){
            if(tmp[i] > maxi) maxi = tmp[i];
        }

        return maxi;
    }
}