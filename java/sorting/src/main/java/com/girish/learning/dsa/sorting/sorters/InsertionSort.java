package com.girish.learning.dsa.sorting.sorters;

public class InsertionSort implements Sorter {

    @Override
    public int[] sort(int[] array) {
        for (int i = 1; i < array.length; i += 1) {
            int temp = array[i];
            int j = i - 1;
            while(j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j -= 1;
            }
            array[j + 1] = temp;
        }
        return array;
    }

}
