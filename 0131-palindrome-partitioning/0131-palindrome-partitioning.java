class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> curr = new ArrayList<>();
        int n = s.length();
        backtrack(0, s, curr, res, n);
        return res;
    }

    public void backtrack(int idx, String s, List<String> curr, List<List<String>> res, int n) {
        if(idx == n){
            res.add(new ArrayList<>(curr));
            return;
        }

        for(int i = idx; i < n; i++){
            if(isPalindrome(s, idx, i)){
                curr.add(s.substring(idx, i + 1));
                backtrack(i + 1, s, curr, res, n);
                curr.remove(curr.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String s, int left, int right) {
        while(left < right) {
            if(s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}