import java.util.Arrays;

/**
 * Week 4 Practice L4 - Merge Two Sorted Arrays (two pointers)
 */
public class P4_MergeTwoSortedArrays {

    static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }
        while (i < arr1.length) result[k++] = arr1[i++];   // leftovers from arr1
        while (j < arr2.length) result[k++] = arr2[j++];   // leftovers from arr2
        return result;
    }

    public static void main(String[] args) {
        int[][][] inputs = {
                {{1, 3, 5}, {2, 4, 6}},
                {{}, {1, 2, 3}}
        };
        for (int[][] pair : inputs) {
            System.out.println("arr1 = " + Arrays.toString(pair[0]) + ", arr2 = " + Arrays.toString(pair[1])
                    + " -> " + Arrays.toString(mergeSortedArrays(pair[0], pair[1])));
        }
    }
}
