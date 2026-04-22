public class SelectionSort implements Sorter {

    @Override
    public int[] sort(int[] array) {
        for (int i = 0; i < array.length - 1; i += 1) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j += 1) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                ArrayUtil.swapArrayElements(array, i, minIndex);
            }
        }
        return array;
    }

}
