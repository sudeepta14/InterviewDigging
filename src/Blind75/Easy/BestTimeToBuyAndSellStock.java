package Blind75.Easy;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args){
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices){
        int maxProfit = 0;
        int minValue = Integer.MAX_VALUE;

        for(int i=0; i<prices.length; i++){
            if(minValue > prices[i]){
                minValue = prices[i];
            }
            maxProfit = Math.max(maxProfit, prices[i] - minValue);
        }
        return maxProfit;
    }
}
