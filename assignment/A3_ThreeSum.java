import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Week 4 Assignment A3 - 3Sum: all unique triplets that sum to zero.
 * Sort, then fix one element and use two pointers on the rest. O(n^2).
 */
public class A3_ThreeSum {

    static int[][] threeSum(int[] input) {
        int[] nums = input.clone();
        Arrays.sort(nums);
        List<int[]> triplets = new ArrayList<int[]>();

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;  // skip duplicate first values
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    triplets.add(new int[]{nums[i], nums[left], nums[right]});
                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left - 1]) left++;    // skip duplicates
                    while (left < right && nums[right] == nums[right + 1]) right--; // skip duplicates
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return triplets.toArray(new int[triplets.size()][]);
    }

    static String toText(int[][] triplets) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < triplets.length; i++) {
            sb.append(Arrays.toString(triplets[i])).append(i < triplets.length - 1 ? ", " : "");
        }
        return sb.append("]").toString();
    }

    public static void main(String[] args) {
        int[][] inputs = {{-1, 0, 1, 2, -1, -4}, {0, 0, 0}, {-2, 0, 0, 2, 2, -2, 0}};
        for (int[] nums : inputs) {
            System.out.println("nums = " + Arrays.toString(nums) + " -> " + toText(threeSum(nums)));
        }
    }
}
