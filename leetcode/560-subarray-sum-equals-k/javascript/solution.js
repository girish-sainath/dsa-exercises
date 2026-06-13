
let subarraySum = function(nums, k) {
    let count = 0;
    let sum = 0;
    const map = {};
    map[0] = 1;
    for (let i = 0; i < nums.length; i += 1) {
        sum += nums[i];
        if (map[sum - k]) {
            count += map[sum - k];
        }
        map[sum] = (map[sum] || 0) + 1;
    }
    return count;
};

let subarraySumBruteForce = function(nums, k) {
    let count = 0;
    for (let i = 0; i < nums.length; i += 1) {
        let sum = 0;
        for (let j = i; j < nums.length; j += 1) {
            sum += nums[j];
            if (sum === k) {
                count++;
            }
        }
    }
    return count;
};


console.assert(subarraySumBruteForce([1, 1, 1], 2) === 2, 'Expected 2 but did not get it');
console.assert(subarraySumBruteForce([1, 2, 3], 3) === 2, 'Expected 2 but did not get it');

console.assert(subarraySum([1, 1, 1], 2) === 2, 'Expected 2 but did not get it');
console.assert(subarraySum([1, 2, 3], 3) === 2, 'Expected 2 but did not get it');
