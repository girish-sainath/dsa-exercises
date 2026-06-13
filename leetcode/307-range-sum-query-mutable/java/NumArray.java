public class NumArray {

    public static void main(String[] args) {
        int[] arr = {-2, 0, 3, -5, 2, -1};
        NumArray numArray = new NumArray(arr);
        System.out.println(numArray.sumRange(0, 2));
        System.out.println(numArray.sumRange(2, 5));
        System.out.println(numArray.sumRange(0, 5));
    }

    private int[] nums;
    
    public NumArray(int[] nums) {
        int total = 0;
        for (int i = 0; i < nums.length; i += 1) {
            nums[i] += total;
            total = nums[i];
        }
        this.nums = nums;
    }

    public void update(int index, int val) {
        int diff = val - (index == 0 ? nums[index] : nums[index] - nums[index - 1]);
        for (int i = index; i < nums.length; i += 1) {
            nums[i] += diff;
        }
    }
    
    public int sumRange(int left, int right) {
        if (left == 0)  return nums[right];
        return nums[right] - nums[left - 1];
    }
}