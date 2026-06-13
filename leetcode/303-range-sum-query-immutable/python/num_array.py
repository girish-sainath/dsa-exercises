class NumArray:
    
    def __init__(self, nums: list[int]):
        total = 0
        for i in range(len(nums)):
            nums[i] += total
            total = nums[i]
        self.nums = nums
    
    
    def sumRange(self, left: int, right: int) -> int:
        if left == 0:
            return self.nums[right]
        return self.nums[right] - self.nums[left - 1]


if __name__ == '__main__':
    numArr = NumArray([-2, 0, 3, -5, 2, -1])
    print(numArr.sumRange(0, 2))
    print(numArr.sumRange(2, 5))
    print(numArr.sumRange(0, 5))
