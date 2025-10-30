import statistics
class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        ans = statistics.mode(nums)
        return ans