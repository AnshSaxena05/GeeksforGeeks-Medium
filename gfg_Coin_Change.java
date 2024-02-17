public class gfg_Coin_Change {
    public long count(int coins[], int N, int sum) {
        long[] dp = new long[sum + 1];
        dp[0] = 1;

        for (int i = 0; i < N; i++) {
            for (int j = 1; j < sum + 1; j++) {
                int coinValue = coins[i];

                if (j - coinValue >= 0) {
                    dp[j] = dp[j] + dp[j - coinValue];
                }
            }
        }
        return dp[sum];
    }

    public static void main(String[] args) {
        gfg_Coin_Change coinChange = new gfg_Coin_Change();

        // Example usage:
        int[] coins = { 1, 2, 3 };
        int sum = 4;
        int N = coins.length;

        long result = coinChange.count(coins, N, sum);

        System.out.println("Number of ways to make change: " + result);
    }
}