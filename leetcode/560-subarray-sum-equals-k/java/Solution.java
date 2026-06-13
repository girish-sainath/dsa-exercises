import java.util.HashMap;
import java.util.Map;

class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();

        assert solution.subarraySumBruteForce(new int[]{1,1,1}, 2) == 2 : "Expected 2 but did not get it";
        assert solution.subarraySumBruteForce(new int[]{1,2,3}, 3) == 2 : "Expected 2 but did not get it";

        assert solution.subarraySum(new int[]{1,1,1}, 2) == 2 : "Expected 2 but did not get it";
        assert solution.subarraySum(new int[]{1,2,3}, 3) == 2 : "Expected 2 but did not get it";
    }

    public int subarraySumBruteForce(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i += 1) {
            int sum = 0;
            for (int j = i; j < nums.length; j += 1) {
                sum += nums[j];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }

    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < nums.length; i += 1) {
            sum += nums[i];
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}