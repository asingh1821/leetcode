package Example;

public class BestTimeToBuyAndSellStockII {

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int result = maxProfit(prices);
        System.out.println(result);
    }
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        for(int i = 0; i < prices.length; i++){
            for(int j = i+1; j < prices.length; j++){
                if(prices[i] > prices[j]){
                    continue;
                }else if(maxProfit < prices[j] - prices[i]) {
                    maxProfit = prices[j] - prices[i];
                }
            }
        }
        return maxProfit;
    }
}
