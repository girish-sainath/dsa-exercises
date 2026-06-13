class Solution:
    
    def subarraySumBruteForce(self, nums: list[int], k: int) -> int:
        count = 0
        for i in range(len(nums)):
            sum = 0
            for j in range(i, len(nums)):
                sum += nums[j]
                if sum == k:
                    count += 1
        return count
    
    def subarraySum(self, nums: list[int], k: int) -> int:
        count: int = 0
        sum: int = 0
        prefix_sums: dict = {0: 1}
        for n in nums:
            sum += n
            diff = sum - k
            count += prefix_sums.get(diff, 0)
            prefix_sums[sum] = 1 + prefix_sums.get(sum, 0)
        return count


if __name__ == '__main__':
    sol = Solution()
    assert sol.subarraySumBruteForce([1, 1, 1], 2) == 2, 'Expected 2 but did not get it'
    assert sol.subarraySumBruteForce([1, 2, 3], 3) == 2, 'Expected 2 but did not get it'

    assert sol.subarraySum([1, 1, 1], 2) == 2, 'Expected 2 but did not get it'
    assert sol.subarraySum([1, 2, 3], 3) == 2, 'Expected 2 but did not get it'