const calculatePrefixSum = function (arr) {
    let prefixSum = [arr[0]];
    for (let i = 1; i < arr.length; i += 1) {
        prefixSum[i] = prefixSum[i - 1] + arr[i];
    }
    return prefixSum;
};

let arr = [30, 40, 10, 60, 20, 50];
let prefixSum = calculatePrefixSum(arr);

console.log('Original Array:');
console.log(arr);

console.log('Prefix Sum Array:');
console.log(prefixSum);