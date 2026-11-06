import java.util.Arrays;

/**
 * Week 4 Assignment A1 - Product of Array Except Self
 * O(n) time, no division: a forward pass of left products, then a backward pass of right products.
 */
public class A1_ProductOfArrayExceptSelf {

    static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        // Forward pass: answer[i] = product of everything to the left of i
        answer[0] = 1;
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }
        // Backward pass: multiply in the product of everything to the right of i
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] = answer[i] * rightProduct;
            rightProduct = rightProduct * nums[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        int[][] inputs = {{1, 2, 3, 4}, {-1, 1, 0, -3, 3}};
        for (int[] nums : inputs) {
            System.out.println("nums = " + Arrays.toString(nums) + " -> " + Arrays.toString(productExceptSelf(nums)));
        }
    }
}
