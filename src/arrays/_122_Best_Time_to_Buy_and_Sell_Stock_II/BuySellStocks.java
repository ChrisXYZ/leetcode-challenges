package arrays._122_Best_Time_to_Buy_and_Sell_Stock_II;

public class BuySellStocks {


    public static int maxProfit(int[] prices) {
        int maxDiff = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                maxDiff = maxDiff + (prices[i] - prices[i - 1]);
            }
        }
        return maxDiff;
    }

    public static void main(String[] args) {
        int[] input = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(input));

    }
}

