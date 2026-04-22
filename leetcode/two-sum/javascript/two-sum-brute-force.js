const twoSum = function(numbers, target) {
    for (let i = 0, l = numbers.length; i < l; i += 1) {
        for (let j = i + 1, m = numbers.length; j < m; j += 1) {
            if (numbers[j] === target - numbers[i]) {
                return [i, j];
            }
        }
    }
    return [];
};

console.log(twoSum([2, 4, 5, 6, 11], 10));