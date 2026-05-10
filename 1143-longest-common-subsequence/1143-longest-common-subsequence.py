class Solution:
    def longestCommonSubsequence(self, text1: str, text2: str) -> int:
        ans = []
        for i in range(0,len(text1)+2) :
            row = []
            for j in range(0,len(text2)+2) :
                row.append(0)
            ans.append(row)
        for j in range(1,len(text2)+1) :      
             for i in range(1,len(text1)+1) :
                if text1[i-1] == text2[j-1] :
                    ans[i][j]=ans[i-1][j-1]+1
                else :
                    ans[i][j] = max(ans[i][j-1],ans[i-1][j])
        print(ans)
        return ans[len(text1)][len(text2)]