import java.util.Map;
import java.util.HashMap;

class TwoSumTwoPassHashTable {
    
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> hashmap = new HashMap<>();
        for (int i = 0, l = numbers.length; i < l; i += 1) {
            hashmap.put(numbers[i], i);
        }
        for (int i = 0, l = numbers.length; i < l; i += 1) {
            int complement = target - numbers[i];
            if (hashmap.containsKey(complement) && hashmap.get(complement) != i) {
                return new int[] {i, hashmap.get(complement)};
            }
        }
        return new int[] {};
    }
    
    public static void main(String[] args) {
        TwoSumTwoPassHashTable main = new TwoSumTwoPassHashTable();
        int[] numbers = {1, 3, 4, 5, 6, 8, 9};
        int[] output = main.twoSum(numbers, 8);
        System.out.println("[" + output[0] + ", " + output[1] + "]");
    }
}