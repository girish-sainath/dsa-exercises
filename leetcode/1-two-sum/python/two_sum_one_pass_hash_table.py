class Solution:
    def two_sum(self, nums:list[int], target:int) -> list[int]:
        hashmap = {}
        for i in range(len(nums)):
            complement = target - nums[i]
            if complement in hashmap:
                return [hashmap[complement], i]
            hashmap[nums[i]] = i
        return []

sol = Solution()
print(sol.two_sum([1, 3, 4, 6, 7, 11], 9))