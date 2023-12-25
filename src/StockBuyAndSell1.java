import java.util.Arrays;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
public class StockBuyAndSell1 {
    //prices = [7,1,5,3,6,4]
    public int maxProfit(int[] prices) {
        int maxProfit = Integer.MIN_VALUE;
        int min = prices[0];
        int diff = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] <= min) {
                min = prices[i];
            }
            else {
                diff = prices[i] - min;
                maxProfit = Math.max(maxProfit, diff);
            }
        }

        return Math.max(maxProfit, 0);
    }

    public static void main(String[] args) {
        System.out.println((new StockBuyAndSell1()).maxProfit(new int[] {7,1,5,3,6,4}));
    }
}
