// Leetcode - 121. Best Time to Buy and Sell Stock

public class L121 {
    public int maxProfit(int[] prices) {
        int currentPrice = prices[0];
        int maxProfit = 0;
        for(int i=1; i<prices.length; i++){
            maxProfit = Math.max(maxProfit,prices[i] - currentPrice);
            currentPrice = Math.min(currentPrice,prices[i]);
        }
        return maxProfit;
    }
}
