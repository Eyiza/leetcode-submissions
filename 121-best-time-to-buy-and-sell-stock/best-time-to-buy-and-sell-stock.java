class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int min = prices[0];
        int right = prices.length-1;

       for (int price : prices){
        if (price < min) min = price;
        int profit = price - min;
        if (profit > maxProfit) maxProfit = profit;
       }

        return maxProfit;
    }
}