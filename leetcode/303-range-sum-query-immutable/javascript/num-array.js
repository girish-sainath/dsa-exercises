let NumArray = function(nums) {
    this.nums = [nums[0]];
    for (let i = 1; i < nums.length; i += 1) {
        this.nums[i] = this.nums[i - 1] + nums[i];
    }
};


NumArray.prototype.sumRange = function(left, right) {
    if (left === 0) {
        return this.nums[right];
    }
    return this.nums[right] - this.nums[left - 1];
};

let numArray = new NumArray([-2, 0, 3, -5, 2, -1]);
console.log(numArray.sumRange(0, 2));
console.log(numArray.sumRange(2, 5));
console.log(numArray.sumRange(0, 5));