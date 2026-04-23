public class TwoSumBruteForce {
    
    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0, l = numbers.length; i < l; i += 1) {
            for (int j = i + 1, m = numbers.length; j < m; j += 1) {
                if (numbers[j] == target - numbers[i]) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }
    
    public static void main(String[] args) {
        TwoSumBruteForce main = new TwoSumBruteForce();
        int[] numbers = {1, 3, 4, 5, 6, 8, 9};
        int[] output = main.twoSum(numbers, 8);
        System.out.println("[" + output[0] + ", " + output[1] + "]");
    }
}