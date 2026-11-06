import java.util.Arrays;

/**
 * Week 4 Practice L2 - Best Time to Buy and Sell Stock (single pass)
 */
public class P2_BestTimeToBuyAndSellStock {

    static int maxProfit(int[] prices) {
        int lowestSoFar = Integer.MAX_VALUE;
        int bestProfit = 0;
        for (int price : prices) {
            if (price < lowestSoFar) {
                lowestSoFar = price;
            }
            int profitToday = price - lowestSoFar;
            if (profitToday > bestProfit) {
                bestProfit = profitToday;
            }
        }
        return bestProfit;
    }

    public static void main(String[] args) {
        int[][] inputs = {{7, 1, 5, 3, 6, 4}, {7, 6, 4, 3, 1}};
        for (int[] prices : inputs) {
            System.out.println("prices = " + Arrays.toString(prices) + " -> " + maxProfit(prices));
        }
    }
}
