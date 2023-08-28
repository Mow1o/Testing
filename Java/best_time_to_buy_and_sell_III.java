import java.util.Scanner; 
import java.util.*;
class Solution {
    public int maxProfit(int[] prices) { 
    int n = prices.length;
    if (n < 2) return 0;

    int[] profit1 = new int[n];
    int[] profit2 = new int[n];

    int minPrice = prices[0];
    for (int i = 1; i < n; i++) { // loopataan läpi taulukko
        profit1[i] = Math.max(profit1[i - 1], prices[i] - minPrice);
        minPrice = Math.min(minPrice, prices[i]);
    }

    int maxPrice = prices[n - 1];
    for (int i = n - 2; i >= 0; i--) {
        profit2[i] = Math.max(profit2[i + 1], maxPrice - prices[i]);
        maxPrice = Math.max(maxPrice, prices[i]);
    }

    int maxProfit = 0;
    for (int i = 0; i < n; i++) {
        maxProfit = Math.max(maxProfit, profit1[i] + profit2[i]);
    }

    return maxProfit;
}



public static void main(String[] args) {

    // User input for prices
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of prices: ");
    int n = sc.nextInt();
    int[] prices = new int[n];
    for (int i = 0; i < n; i++) {
    System.out.print("Enter price for day " + (i+1) + ": ");
    prices[i] = sc.nextInt();
    }
    sc.close();

    
    //int[] prices = {3,3,5,0,0,3,1,4}; //default prices

    Solution s = new Solution();
    System.out.println(s.maxProfit(prices)); 
}
}


