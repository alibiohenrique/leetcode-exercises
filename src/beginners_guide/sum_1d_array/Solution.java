package beginners_guide.sum_1d_array;

public class Solution {
    public int[] runningSum(int[] nums) {

        if (nums.length == 1) {
            return nums;
        } else {

            int actual;
            int[] result = new int[nums.length];

            boolean first = true;
            for (int i = 1; i < nums.length; i++) {

                if (first) {
                    first = false;
                    actual = nums[0];
                    result[0] = actual;
                }
                actual = nums[i] + result[i - 1];
                result[i] = actual;
            }
            return result;
        }
    }
}

class Program {
    static int[] arr = new int[]{1, 2, 3, 4};
    static int[] arrs = new int[]{1};

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.runningSum(arr);
        solution.runningSum(arrs);
    }
}