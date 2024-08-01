class Solution {
    public int maxProfit(int[] prices) {
        int minPrice=prices[0];
        int prof=0;
        for(int i=1;i<prices.length;i++){
            prof=Math.max(prof,prices[i]-minPrice);
            minPrice=Math.min(prices[i],minPrice);
        }
        return prof;
    }
}
