import java.util.Arrays;

/**
 * Week 4 Assignment A2 - Maximum Subarray (Kadane's algorithm), O(n) time, O(1) space
 */
public class A2_MaximumSubarray {

    static int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int bestSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            // Extend the running subarray, or restart from this element - whichever is larger
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            bestSum = Math.max(bestSum, currentSum);
        }
        return bestSum;
    }

    public static void main(String[] args) {
        int[][] inputs = {{-2, 1, -3, 4, -1, 2, 1, -5, 4}, {-3, -1, -2}};
        for (int[] nums : inputs) {
            System.out.println("nums = " + Arrays.toString(nums) + " -> " + maxSubArray(nums));
        }
    }
}
