import java.util.Arrays;

/**
 * Week 4 Practice L5 - Rotate Array to the right by k positions
 */
public class P5_RotateArray {

    static int[] rotateArray(int[] nums, int k) {
        if (nums.length == 0) return nums;
        k = k % nums.length;
        int[] rotated = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            rotated[(i + k) % nums.length] = nums[i];
        }
        return rotated;
    }

    public static void main(String[] args) {
        int[][] inputs = {{1, 2, 3, 4, 5, 6, 7}, {1, 2}};
        int[] ks = {3, 3};
        for (int t = 0; t < inputs.length; t++) {
            System.out.println("nums = " + Arrays.toString(inputs[t]) + ", k = " + ks[t]
                    + " -> " + Arrays.toString(rotateArray(inputs[t], ks[t])));
        }
    }
}
