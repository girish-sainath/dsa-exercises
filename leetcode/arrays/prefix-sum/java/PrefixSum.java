import java.util.Arrays;

public class PrefixSum {
    
    private PrefixSum() {}

    public static void main(String[] args) {
        int[] arr = {10, 30, 20, 60, 50, 40};
        int[] prefixSum = PrefixSum.calculatePrefixSumNewArray(arr);
        System.out.println("Original array:");
        System.out.println(Arrays.toString(arr));

        System.out.println("Prefix sum array:");
        System.out.println(Arrays.toString(prefixSum));
    }
    
    public static int[] calculatePrefixSumNewArray(int[] arr) {
        int[] prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];
        for (int i = 1; i < arr.length; i += 1) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        return prefixSum;
    }
}