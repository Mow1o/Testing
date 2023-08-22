class Solution {
    
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;  // initialize to maximum possible value
        int maxProfit = 0;  // initialize to 0
        
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;  // update minPrice if a smaller price is found
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;  // update maxProfit if a larger profit is found
            }
        }
        return maxProfit;
    }
    
    public static void main(String[] args) {
        int[] prices = {3,3,5,0,0,3,1,4};
        Solution s = new Solution();
        System.out.println(s.maxProfit(prices));
    }  
}
