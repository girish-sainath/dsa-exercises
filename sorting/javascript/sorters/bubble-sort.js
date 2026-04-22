const sort = function (arr) {
  let swapped = true;
  while (swapped) {
    swapped = false;
    for (let i = 0; i < arr.length - 1; i++) {
      if (arr[i] > arr[i + 1]) {
        const temp = arr[i];
        arr[i] = arr[i + 1];
        arr[i + 1] = temp;
        swapped = true;
      }
    }
  }
  return arr;
};

console.log(JSON.stringify(sort([5, 11, 78, 23, 12, 3, 8, 6, 1, 7, 4, 2])));

module.exports = { sort };