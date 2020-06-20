package arrays._122._Best_Time_to_Buy_and_Sell_Stock_II;

public class BuySellStocks {


    public static int maxProfit(int[] prices) {
        int output = 0;
        for (int i = 1; i < prices.length; i++) {
            int diff = prices[i] - prices[i - 1];
            if (diff > 0) {
                output = output + diff;
            }
        }
        return output;
    }

    public static void main(String[] args) {
        int[] input = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(input));

    }
}

