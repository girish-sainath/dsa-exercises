const twoSum = function(numbers, target) {
    const map = new Map();
    for (let i = 0, l = numbers.length; i < l; i += 1) {
        map.set(numbers[i], i);
    }
    for (let i = 0, l = numbers.length; i < l; i += 1) {
        const complement = target - numbers[i];
        if (map.has(complement) && map.get(complement) != i) {
            return [i, map.get(complement)];
        }
    }
    return [];
};

console.log(twoSum([2, 4, 5, 6, 11], 10));