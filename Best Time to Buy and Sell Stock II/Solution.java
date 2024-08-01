class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length,maxprof=0;
        for(int i=0;i<n-1;i++){
            if(prices[i]<prices[i+1]){
                maxprof=maxprof-prices[i]+prices[i+1];
            }
        }
        return maxprof;
    }
}
