public class Buy_and_Sell_a_Share_at_most_twice {
    public static int maxProfit(int n, int[] price) {
        int s1 = 0;
        int s2 = 0;
        int b1 = Integer.MAX_VALUE;
        int b2 = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int cur = price[i];
            b1 = Math.min(b1, cur);
            s1 = Math.max(s1, cur - b1);
            b2 = Math.min(b2, cur - s1);
            s2 = Math.max(s2, cur - b2);

        }
        return s2;
    }

    public static void main(String[] args) {
        int[] prices = { 3, 3, 5, 0, 0, 3, 1, 4 };
        int n = prices.length;
        int result = maxProfit(n, prices);
        System.out.println("Maximum Profit: " + result);
    }
}
