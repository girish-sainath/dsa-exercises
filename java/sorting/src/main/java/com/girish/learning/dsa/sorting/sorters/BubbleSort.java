package com.girish.learning.dsa.sorting.sorters;

public class BubbleSort implements Sorter {

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    @Override
    public int[] sort(int[] array) {
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < array.length - 1; i += 1) {
                if (array[i] > array[i + 1]) {
                    swapped = true;
                    swap(array, i, i + 1);
                }
            }
        }
        return array;
    }
}
