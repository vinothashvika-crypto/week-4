import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Week 4 Assignment A4 - Subarray Sum Equals K
 * Prefix sums + a hash map of how often each prefix sum has appeared. O(n) time, O(n) space.
 * (A sliding window does not work here because negative numbers can shrink a window's sum.)
 */
public class A4_SubarraySumEqualsK {

    static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> prefixCount = new HashMap<Integer, Integer>();
        prefixCount.put(0, 1); // the empty prefix, so subarrays starting at index 0 are counted
        int currentSum = 0, count = 0;
        for (int num : nums) {
            currentSum += num;
            Integer earlier = prefixCount.get(currentSum - k);
            if (earlier != null) count += earlier;
            Integer seen = prefixCount.get(currentSum);
            prefixCount.put(currentSum, seen == null ? 1 : seen + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] inputs = {{1, 1, 1}, {1, -1, 0}};
        int[] ks = {2, 0};
        for (int t = 0; t < inputs.length; t++) {
            System.out.println("nums = " + Arrays.toString(inputs[t]) + ", k = " + ks[t] + " -> " + subarraySum(inputs[t], ks[t]));
        }
    }
}
