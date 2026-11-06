import java.util.Arrays;

/**
 * Week 4 Practice L1 - Two Sum (shopkeeper budget pair)
 * Brute force with two nested loops.
 */
public class P1_TwoSum {

    static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0]; // not reached when exactly one valid pair exists
    }

    public static void main(String[] args) {
        int[][] inputs = {{2, 7, 11, 15}, {3, 2, 4}};
        int[] targets = {9, 6};
        for (int t = 0; t < inputs.length; t++) {
            int[] result = twoSum(inputs[t], targets[t]);
            System.out.println("nums = " + Arrays.toString(inputs[t]) + ", target = " + targets[t]
                    + " -> " + Arrays.toString(result)
                    + " (" + inputs[t][result[0]] + " + " + inputs[t][result[1]] + " = " + targets[t] + ")");
        }
    }
}
