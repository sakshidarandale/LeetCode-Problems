class Solution {
    public int maxProfit(int[] prices) 
    {
        int maxprofit = 0;
        int buyPrice = Integer.MAX_VALUE;
        
        for(int i = 0; i < prices.length; i++)
        {
            if(buyPrice < prices[i])
            {
                buyPrice = Math.min(prices[i],buyPrice);
                int profit = prices[i] - buyPrice;
                maxprofit = Math.max(maxprofit,profit);
            }

            else
            {
                buyPrice = prices[i]; 
            }
            
        }

        return maxprofit;

        // int maxprofit = 0;
        // int bestbuy = prices[0];
        
        // for(int i = 1; i < prices.length; i++)
        // {
        //     if(prices[i] > bestbuy)
        //     {
        //         maxprofit = Math.max(maxprofit,prices[i] - bestbuy);
        //     }

        //     bestbuy = Math.min(bestbuy,prices[i]);
            
        // }

        // return maxprofit;
    }

}