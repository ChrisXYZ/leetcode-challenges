package arrays._121_Best_Time_to_Buy_and_Sell_Stock;

public class BuySellStocks {


    public static int maxProfit(int[] prices) {
        int maxDiff = 0;
        int tempDiff;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i; j < prices.length; j++) {
                tempDiff = prices[j] - prices[i];
                if (tempDiff > maxDiff) maxDiff = tempDiff;
            }
        }
        return maxDiff;
    }

    public static void main(String[] args) {
        int[] input = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(input));

    }
}

