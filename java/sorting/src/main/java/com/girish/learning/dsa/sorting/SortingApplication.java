package com.girish.learning.dsa.sorting;

import com.girish.learning.dsa.sorting.logging.ConsoleLogger;
import com.girish.learning.dsa.sorting.sorters.BubbleSort;
import com.girish.learning.dsa.sorting.sorters.InsertionSort;
import com.girish.learning.dsa.sorting.sorters.QuickSort;
import com.girish.learning.dsa.sorting.sorters.SelectionSort;
import com.girish.learning.dsa.sorting.util.ArrayUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SortingApplication {

	private static final int ARRAY_SIZE = 10;
	private static final int VALUE_RANGE = 100;
	private static final String LINE_SEPARATOR = "\n---------------------------------------\n";

	public static void main(String[] args) {
		SpringApplication.run(SortingApplication.class, args);

		ConsoleLogger.info(LINE_SEPARATOR);

		int[] arrayForInsertionSort = ArrayUtil.prepareArray(ARRAY_SIZE, VALUE_RANGE);
		ConsoleLogger.info("Unsorted Array for Insertion Sort:");
		ArrayUtil.printArray(arrayForInsertionSort);
		long startTimeOfInsertionSort = System.currentTimeMillis();
		int[] sortedArrayOfInsertionSort = ArrayUtil.sort(arrayForInsertionSort, new InsertionSort());
		long endTimeOfInsertionSort = System.currentTimeMillis();
		ConsoleLogger.info("Sorted Array using Insertion Sort:");
		ArrayUtil.printArray(sortedArrayOfInsertionSort);
		ConsoleLogger.info("Time Taken for Insertion Sort = " + (endTimeOfInsertionSort - startTimeOfInsertionSort) + " ms");

		ConsoleLogger.info(LINE_SEPARATOR);

		int[] arrayForSelectionSort = ArrayUtil.prepareArray(ARRAY_SIZE, VALUE_RANGE);
		ConsoleLogger.info("Unsorted Array for Selection Sort:");
		ArrayUtil.printArray(arrayForSelectionSort);
		long startTimeOfSelectionSort = System.currentTimeMillis();
		int[] sortedArrayOfSelectionSort = ArrayUtil.sort(arrayForSelectionSort, new SelectionSort());
		long endTimeOfSelectionSort = System.currentTimeMillis();
		ConsoleLogger.info("Sorted Array using Selection Sort:");
		ArrayUtil.printArray(sortedArrayOfSelectionSort);
		ConsoleLogger.info("Time Taken for Selection Sort = " + (endTimeOfSelectionSort - startTimeOfSelectionSort) + " ms");

		ConsoleLogger.info(LINE_SEPARATOR);

		int[] arrayForBubbleSort = ArrayUtil.prepareArray(ARRAY_SIZE, VALUE_RANGE);
		ConsoleLogger.info("Unsorted Array for Bubble Sort:");
		ArrayUtil.printArray(arrayForBubbleSort);
		long startTimeOfBubbleSort = System.currentTimeMillis();
		int[] sortedArrayOfBubbleSort = ArrayUtil.sort(arrayForBubbleSort, new BubbleSort());
		long endTimeOfBubbleSort = System.currentTimeMillis();
		ConsoleLogger.info("Sorted Array using Bubble Sort:");
		ArrayUtil.printArray(sortedArrayOfBubbleSort);
		ConsoleLogger.info("Time Taken for Bubble Sort = " + (endTimeOfBubbleSort - startTimeOfBubbleSort) + " ms");

		ConsoleLogger.info(LINE_SEPARATOR);

		int[] arrayForQuickSort = ArrayUtil.prepareArray(ARRAY_SIZE, VALUE_RANGE);
		ConsoleLogger.info("Unsorted Array for Quick Sort:");
		ArrayUtil.printArray(arrayForQuickSort);
		long startTimeOfQuickSort = System.currentTimeMillis();
		int[] sortedArrayOfQuickSort = ArrayUtil.sort(arrayForQuickSort, new QuickSort());
		long endTimeOfQuickSort = System.currentTimeMillis();
		ConsoleLogger.info("Sorted Array using Quick Sort:");
		ArrayUtil.printArray(sortedArrayOfQuickSort);
		ConsoleLogger.info("Time Taken for Quick Sort = " + (endTimeOfQuickSort - startTimeOfQuickSort) + " ms");

		ConsoleLogger.info(LINE_SEPARATOR);
	}

}
