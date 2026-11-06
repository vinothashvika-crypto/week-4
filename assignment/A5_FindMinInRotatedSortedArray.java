import java.util.Arrays;

/**
 * Week 4 Assignment A5 - Find Minimum in Rotated Sorted Array (modified binary search, O(log n))
 */
public class A5_FindMinInRotatedSortedArray {

    static int findMin(int[] nums) {
        int low = 0, high = nums.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] > nums[high]) {
                low = mid + 1;   // minimum is to the right of mid
            } else {
                high = mid;      // minimum is at mid or to its left
            }
        }
        return nums[low];
    }

    public static void main(String[] args) {
        int[][] inputs = {{3, 4, 5, 1, 2}, {4, 5, 6, 7, 0, 1, 2}, {11, 13, 15, 17}};
        for (int[] nums : inputs) {
            System.out.println("nums = " + Arrays.toString(nums) + " -> " + findMin(nums));
        }
    }
}
