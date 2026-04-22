import java.util.Random;

public class ArrayUtil {

    private ArrayUtil() {

    }

    private static final Random random = new Random();

    public static int[] prepareArray(int count, int range) {
        int[] array = new int[count];
        for (int i = 0; i < array.length; i += 1) {
            array[i] = random.nextInt(range);
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i += 1) {
            System.out.print(" " + array[i]);
        }
        System.out.println("");
    }

    public static void swapArrayElements(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static int[] sort(int[] array, Sorter sorter) {
        return sorter.sort(array);
    }

}
