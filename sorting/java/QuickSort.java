import java.util.Random;

public class QuickSort implements Sorter {

    Random r = new Random();

    @Override
    public int[] sort(int[] array) {
        return quicksort(array, 0, array.length - 1);
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private int generatePivot(int lowIndex, int highIndex) {
        return r.nextInt(highIndex - lowIndex) + lowIndex;
    }

    private int[] quicksort(int[] array, int low, int high) {
        if (low >= high) {
            return array;
        }
        int pivotIndex = generatePivot(low, high);
        swap(array, pivotIndex, high);
        int pivot = array[high];
        int left = partition(array, low, high, pivot);
        quicksort(array, 0, left - 1);
        quicksort(array, left + 1, high);
        return array;
    }

    private int partition(int[] array, int low, int high, int pivot) {
        int left = low;
        int right = high - 1;

        while (left <= right) {
            while (left <= right && array[left] < pivot) {
                left += 1;
            }
            while (left <= right && array[right] > pivot) {
                right -= 1;
            }
            if (left <= right) {
                swap(array, left, right);
            }
        }
        swap(array, left, high);
        return left;
    }
}
