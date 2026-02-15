class Solution:
    def canJump(self, nums: List[int]) -> bool:
        maxreached = 0 
        for i in range(0,len(nums)):
            if i > maxreached :
                return False 
            else :
                maxreached = max(maxreached,nums[i]+i)
        return True

            