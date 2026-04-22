const bubbleSort = require('./sorters/bubble-sort');
const selectionSort = require('./sorters/selection-sort');

function main() {
  console.log('Hello from sorting!');
  console.log(bubbleSort.sort([5, 11, 78, 23, 12, 3, 8, 6, 1, 7, 4, 2]));
  console.log(selectionSort.sort([5, 11, 78, 23, 12, 3, 8, 6, 1, 7, 4, 2]));
}

main();