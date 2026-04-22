public class SortingApplication {

	private static final int ARRAY_SIZE = 10;
	private static final int VALUE_RANGE = 100;
	private static final String LINE_SEPARATOR = "\n---------------------------------------\n";

	public static void main(String[] args) {

		System.out.println(LINE_SEPARATOR);

		int[] arrayForInsertionSort = ArrayUtil.prepareArray(ARRAY_SIZE, VALUE_RANGE);
		System.out.println("Unsorted Array for Insertion Sort:");
		ArrayUtil.printArray(arrayForInsertionSort);
		long startTimeOfInsertionSort = System.currentTimeMillis();
		int[] sortedArrayOfInsertionSort = ArrayUtil.sort(arrayForInsertionSort, new InsertionSort());
		long endTimeOfInsertionSort = System.currentTimeMillis();
		System.out.println("Sorted Array using Insertion Sort:");
		ArrayUtil.printArray(sortedArrayOfInsertionSort);
		System.out.println("Time Taken for Insertion Sort = " + (endTimeOfInsertionSort - startTimeOfInsertionSort) + " ms");

		System.out.println(LINE_SEPARATOR);

		int[] arrayForSelectionSort = ArrayUtil.prepareArray(ARRAY_SIZE, VALUE_RANGE);
		System.out.println("Unsorted Array for Selection Sort:");
		ArrayUtil.printArray(arrayForSelectionSort);
		long startTimeOfSelectionSort = System.currentTimeMillis();
		int[] sortedArrayOfSelectionSort = ArrayUtil.sort(arrayForSelectionSort, new SelectionSort());
		long endTimeOfSelectionSort = System.currentTimeMillis();
		System.out.println("Sorted Array using Selection Sort:");
		ArrayUtil.printArray(sortedArrayOfSelectionSort);
		System.out.println("Time Taken for Selection Sort = " + (endTimeOfSelectionSort - startTimeOfSelectionSort) + " ms");

		System.out.println(LINE_SEPARATOR);

		int[] arrayForBubbleSort = ArrayUtil.prepareArray(ARRAY_SIZE, VALUE_RANGE);
		System.out.println("Unsorted Array for Bubble Sort:");
		ArrayUtil.printArray(arrayForBubbleSort);
		long startTimeOfBubbleSort = System.currentTimeMillis();
		int[] sortedArrayOfBubbleSort = ArrayUtil.sort(arrayForBubbleSort, new BubbleSort());
		long endTimeOfBubbleSort = System.currentTimeMillis();
		System.out.println("Sorted Array using Bubble Sort:");
		ArrayUtil.printArray(sortedArrayOfBubbleSort);
		System.out.println("Time Taken for Bubble Sort = " + (endTimeOfBubbleSort - startTimeOfBubbleSort) + " ms");

		System.out.println(LINE_SEPARATOR);

		int[] arrayForQuickSort = ArrayUtil.prepareArray(ARRAY_SIZE, VALUE_RANGE);
		System.out.println("Unsorted Array for Quick Sort:");
		ArrayUtil.printArray(arrayForQuickSort);
		long startTimeOfQuickSort = System.currentTimeMillis();
		int[] sortedArrayOfQuickSort = ArrayUtil.sort(arrayForQuickSort, new QuickSort());
		long endTimeOfQuickSort = System.currentTimeMillis();
		System.out.println("Sorted Array using Quick Sort:");
		ArrayUtil.printArray(sortedArrayOfQuickSort);
		System.out.println("Time Taken for Quick Sort = " + (endTimeOfQuickSort - startTimeOfQuickSort) + " ms");

		System.out.println(LINE_SEPARATOR);
	}

}
