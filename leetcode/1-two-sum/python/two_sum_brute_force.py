class Solution:
    def two_sum(self, nums: list[int], target: int) -> list[int]:
        for i in range(len(nums)):
            for j in range(i + 1, len(nums)):
                if nums[j] == target - nums[i]:
                    return [i, j]
        return []

sol = Solution()
print(sol.two_sum([2, 7, 11, 15], 9))