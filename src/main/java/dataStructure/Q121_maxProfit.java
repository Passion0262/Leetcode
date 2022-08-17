package dataStructure;

public class Q121_maxProfit {
    public int maxProfit(int[] prices) {
        int minBuy = prices[0];
        int max = 0;
        for (int price : prices) {
            max = Math.max(max,price-minBuy);
            minBuy = Math.min(price,minBuy);
        }
        return max;
    }

    public static void main(String[] args) {
        Q121_maxProfit a = new Q121_maxProfit();
        int[] test = {7,1,5,3,6,4};
        System.out.println(a.maxProfit(test));
    }
}
