class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        
        for(int i = 1; i < prices.length; i++){
            if(prices[i] > prices[i-1]){
                profit += prices[i] - prices[i-1];
            }
        }
        return profit;
    }
}

// When day1's prices bigger that day0's prices which means we can get some profit.
// As one concern is:
// Input: prices = [1,2,3,4,5]
// Output: 4
// Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
// Total profit is 4.
// if we apply this algorithm it will become
// 2-1=1+（3-2）=2+（4-3）=3+（5-4）=4
// but at this point greedy algorithm already become the best Solution, since time is O(n) and Space is O(1) => we only need to traverse the price array once. 