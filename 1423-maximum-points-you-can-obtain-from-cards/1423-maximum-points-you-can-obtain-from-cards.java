class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        
        int currentSum = 0;
        
        //Take first k elements from left
        for (int i = 0; i < k; i++) {
            currentSum += cardPoints[i];
        }
        
        int maxSum = currentSum;
        
        //Shift from left to right
        for (int i = 0; i < k; i++) {
            currentSum = currentSum 
                         - cardPoints[k - 1 - i]   //remove from left side
                         + cardPoints[n - 1 - i];  //add from right side
            
            maxSum = Math.max(maxSum, currentSum);
        }
        
        return maxSum;
    }
}