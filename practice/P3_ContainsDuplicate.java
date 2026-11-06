import java.util.Arrays;

/**
 * Week 4 Practice L3 - Contains Duplicate (exam seating roll numbers)
 */
public class P3_ContainsDuplicate {

    static boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true; // early exit as soon as one pair is found
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] inputs = {{1, 2, 3, 1}, {1, 2, 3, 4}};
        for (int[] nums : inputs) {
            System.out.println("nums = " + Arrays.toString(nums) + " -> " + containsDuplicate(nums));
        }
    }
}
